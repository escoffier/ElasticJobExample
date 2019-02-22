package litejob;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyElasticJob implements SimpleJob {
    private static Logger logger = LoggerFactory.getLogger(MyElasticJob.class);

    public void execute(ShardingContext shardingContext) {

        logger.info("开始执行UserStatJob");
        System.out.println("");

    }
}
