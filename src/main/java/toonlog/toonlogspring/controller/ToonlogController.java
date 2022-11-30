package toonlog.toonlogspring.controller;

import org.springframework.web.bind.annotation.*;

public class ToonlogController {

    private final ArticleService articleService;

    //게시글 조회
    @GetMapping("")
    public List<Article> getAllArticle(){
        return articleService.getArticles();
    }

    // 게시글 작성
    @PostMapping("/api/articles")
    public Article createArticle(@RequestBody ArticleRequestDto articleRequestDto){
        System.out.println("Post-Article!!!");
        return articleService.createArticle(articleRequestDto);
    }
    //게시글 삭제
    @DeleteMapping("/api/articles/{id}")
    public Long deleteArticle(@PathVariable Long id){
        articleService.deleteArticle(id);
        return id;
    }

    //게시글 수정
    @PutMapping("/api/articles/{id}")
    public Long updateArticle(@PathVariable Long id, @RequestBody ArticleRequestDto articleRequestDto){
        return articleService.update(id, articleRequestDto);
    }
}
