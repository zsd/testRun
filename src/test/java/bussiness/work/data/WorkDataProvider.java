package bussiness.work.data;

import bussiness.work.domain.Work;
import com.vansec.comm.DataUtilsTest;
import com.vansec.user.data.UserDataProvider;

/**
 * 作品测试数据提供类
 */
public class WorkDataProvider {

    private WorkDataProvider() {}

    /**
     * 生成数据.
     */
    public static Work getWork() {
        Work work = new Work();
        work.setId(DataUtilsTest.ID_1);
        work.setName("作品标题");
        work.setContent("作品内容");
        work.setUrl("www.baidu.com");
        work.setType("小说");
        work.setRewardMoney(100);
        work.setRewardPoints(100);
        work.setSetCount(100);
        work.setActorCount(20);
        work.setUser(UserDataProvider.getUser());
        return work;
    }
}
