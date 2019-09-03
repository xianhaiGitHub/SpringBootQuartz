package com.example.demo.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestJob implements BaseJob {

    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
    private static Logger _log = LoggerFactory.getLogger(TestJob.class);

    public TestJob() {

    }

    public void execute(JobExecutionContext context)
        throws JobExecutionException {
        _log.error("Test Job执行时间: " + SIMPLE_DATE_FORMAT.format(new Date()));

    }
}
