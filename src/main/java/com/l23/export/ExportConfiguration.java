package com.l23.export;

import org.springframework.boot.actuate.autoconfigure.ExportMetricWriter;
import org.springframework.boot.actuate.metrics.jmx.JmxMetricWriter;
import org.springframework.boot.actuate.metrics.writer.MetricWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.MBeanExporter;
//这个配置可以把监控信息发送到别的地方 这里是通过jconsole jvisual看 不过要添加插件
@Configuration
public class ExportConfiguration {
	@Bean
	@ExportMetricWriter
	public MetricWriter createMetricWriter(MBeanExporter export){
		return new JmxMetricWriter(export);
	}
}
