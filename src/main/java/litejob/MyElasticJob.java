package litejob;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyElasticJob implements SimpleJob {
    private static Logger logger = LoggerFactory.getLogger(MyElasticJob.class);

    public void execute(ShardingContext shardingContext) {

        logger.info("开始执行 My Job");

            switch (shardingContext.getShardingItem()) {
            case 0:
                logger.info("Sharding Item 0=" + shardingContext.getShardingParameter());
                break;
            case 1:
                logger.info("Sharding Item 1=" + shardingContext.getShardingParameter());
                break;
            case 2:
                logger.info("Sharding Item 2=" + shardingContext.getShardingParameter());
                break;
                case 3:
                    logger.info("Sharding Item 3=" + shardingContext.getShardingParameter());
                    break;
        }
        //System.out.println("");
    }
}
