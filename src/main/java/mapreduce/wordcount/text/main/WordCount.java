package mapreduce.wordcount.text.main;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import mapreduce.wordcount.text.map.TokenizerMapper;
import mapreduce.wordcount.text.reduce.IntSumReduce;
import mapreduce.wordcount.text.util.FileUtil;

import java.io.IOException;


public class WordCount {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException, InterruptedException {

        FileUtil.deleteDir("output");
        Configuration conf = new Configuration();

        String[] otherArgs = new String[]{"../input/dream.txt", "output"};
        if (otherArgs.length != 2) {
            System.err.println("Usage:Merge and duplicate removal <in> <out>");
            System.exit(2);
        }

        Job job = Job.getInstance(conf, "WordCount");
        job.setJarByClass(WordCount.class);
        job.setMapperClass(TokenizerMapper.class);
        job.setReducerClass(IntSumReduce.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        FileInputFormat.addInputPath(job, new Path(otherArgs[0]));
        FileOutputFormat.setOutputPath(job, new Path(otherArgs[1]));
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
