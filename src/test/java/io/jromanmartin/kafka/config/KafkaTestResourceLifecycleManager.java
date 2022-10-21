//package io.jromanmartin.kafka.config;
//
//import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
//import io.smallrye.reactive.messaging.connectors.InMemoryConnector;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class KafkaTestResourceLifecycleManager implements QuarkusTestResourceLifecycleManager {
//
//    @Override
//    public Map<String, String> start() {
//        Map<String, String> env = new HashMap<>();
//        Map<String, String> propsIncomingMessages = InMemoryConnector.switchIncomingChannelsToInMemory("messages");
//        env.putAll(propsIncomingMessages);
//        return env;
//    }
//
//    @Override
//    public void stop() {
//        InMemoryConnector.clear();
//    }
//
//}
