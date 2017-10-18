package pl.devcofee.wildfly.swarm;

import com.p6spy.engine.spy.appender.MessageFormattingStrategy;

public class NiceSqlLogFormat implements MessageFormattingStrategy {
	@Override
	public String formatMessage(int connectionId, String now, long elapsed, String category, String prepared, String sql) {
		return category + " on connection " + connectionId + " [duration: " + elapsed + "ms] executed sql: " + prepared;
	}
}
