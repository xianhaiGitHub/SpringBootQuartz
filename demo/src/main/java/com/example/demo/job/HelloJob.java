package com.example.demo.job;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements BaseJob {

    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
    private static Logger _log = LoggerFactory.getLogger(HelloJob.class);

    public HelloJob() {

    }

    public void execute(JobExecutionContext context)
        throws JobExecutionException {
        _log.error("Hello Job执行时间: " + SIMPLE_DATE_FORMAT.format(new Date()));

    }
}
