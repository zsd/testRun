package com.vansec.comm.exception;

import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class MessageProvider {

    private static Logger logger = LoggerFactory.getLogger(MessageProvider.class);

    private static MessageProvider instance;

    private static final Map<String, MessageBundle> map = new HashMap<String, MessageBundle>();

    private MessageProvider() {}

    public static MessageBundle getResource(Class<? extends Enum> clazz) {
        synchronized (MessageBundle.class) {
            if (ObjectUtils.equals(instance, null)) {
                instance = new MessageProvider();
                logger.debug("MessageProvider instantiated");
            }
        }

        String name = clazz.getName();
        MessageBundle bundle = map.get(name);

        if (ObjectUtils.equals(bundle, null)) {
            bundle = new MessageBundle(clazz);
            map.put(name, bundle);
        }
        return bundle;
    }
}
