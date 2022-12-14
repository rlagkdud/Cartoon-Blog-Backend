//package toonlog.toonlogspring.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import toonlog.toonlogspring.repository.ToonRepository;
//
//@Configuration
//public class SpringConfig {
//
//    private final ToonRepository toonRepository;
//
//    @Autowired
//    public SpringConfig(ToonRepository toonRepository) {
//        this.toonRepository = toonRepository;
//    }
//
//    @Bean
//    public ToonService memberService() {
//        return new MemberService(memberRepository);
//    }
//}
