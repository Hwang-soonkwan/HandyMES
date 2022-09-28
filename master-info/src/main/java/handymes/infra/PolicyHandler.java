package handymes.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import handymes.config.kafka.KafkaProcessor;
import handymes.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    UserRepository userRepository;

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    MachineRepository machineRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProgressRepository progressRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}
    // keep

}
