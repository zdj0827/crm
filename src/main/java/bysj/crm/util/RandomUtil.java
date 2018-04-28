package bysj.crm.util;

import java.util.Random;

public class RandomUtil {
    private static Random random = new Random();
    public static long createJobNumber(){
        StringBuffer jobNumberStr = new StringBuffer("");
        for(int i=0;i<8;i++){
            jobNumberStr.append(random.nextInt(9));
        }
        long jobNumber = Long.parseLong(jobNumberStr.toString());
        return jobNumber;
    }
}
