package toonlog.toonlogspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import toonlog.toonlogspring.domain.Frame;
import toonlog.toonlogspring.domain.Toon;

import java.util.List;

@Controller
public class ToonlogController {

    @GetMapping("/") // "/"으로 가면 src/main/resources/home.html을 반환
    public String home(){
        return "home";
    }

    @GetMapping("/write") // /write로 가면 프래임이나 말풍선과 같은 자료(이미지)들을 불러와서 JSON객체로 뿌려줌 - GET
    public Frame write(){
        Frame frame = new Frame(); // 여기에서 Frame객체는 src/main/java/domain에 들어있음! domain폴더는 객체들을 저장해두는 곳이라고 생각하면 편함.
        return frame; // domain/Frame : frame 객체에 이미지를 저장해 두는 방법 알아오기
    }

    @PostMapping("/write/new")
    public String writeToon(){ // Toon을 pdf로 저장
        return "redirect:/";
    }

    @GetMapping("/list") // 모든 툰을 다 가져와서 json 객체로 반환
    @ResponseBody // json객채로 반환할때 사용하는 annotation
    public List<Toon> list(){
        List<Toon> list = ToonService.findToon(); // 서비스 만들기
        return list;
    }


//    private final ArticleService articleService;
//
//    //게시글 조회
//    @GetMapping("")
//    public List<Article> getAllArticle(){
//        return articleService.getArticles();
//    }
//
//    // 게시글 작성
//    @PostMapping("/api/articles")
//    public Article createArticle(@RequestBody ArticleRequestDto articleRequestDto){
//        System.out.println("Post-Article!!!");
//        return articleService.createArticle(articleRequestDto);
//    }
//    //게시글 삭제
//    @DeleteMapping("/api/articles/{id}")
//    public Long deleteArticle(@PathVariable Long id){
//        articleService.deleteArticle(id);
//        return id;
//    }
//
//    //게시글 수정
//    @PutMapping("/api/articles/{id}")
//    public Long updateArticle(@PathVariable Long id, @RequestBody ArticleRequestDto articleRequestDto){
//        return articleService.update(id, articleRequestDto);
//    }
}
