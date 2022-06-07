package kennethjusino.com.BlogService.Controllers;

import kennethjusino.com.BlogService.Models.Blog;
import kennethjusino.com.BlogService.Repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {
//    @Autowired
//    private BlogRepo blogRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome to Kenneth Jusino's Java Spring API 🎉";
    }

    @GetMapping(value="/health")
    public String getHealth(){
        return "Service Up";
    }

    @GetMapping(value = "/hi")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

//    @GetMapping(value="/blogs")
//    public List<Blog> getBlogs(){
//        return blogRepo.findAll();
//    }
//
//    @PostMapping(value="/saveBlog")
//    public String saveBlog(@RequestBody Blog blog ){
//        blogRepo.save(blog);
//        return "Saved new blog";
//    }
//
//    @PutMapping(value="/updateBlog/{id}")
//    public String updateBlog(@PathVariable long id, @RequestBody Blog blog){
//        Blog updatedBlog = blogRepo.findById(id).get();
//        updatedBlog.setAuthor(blog.getAuthor());
//        updatedBlog.setContent(blog.getContent());
//        updatedBlog.setMetadata(blog.getMetadata());
//        updatedBlog.setTitle(blog.getTitle());
//        blogRepo.save(updatedBlog);
//        return String.format("Updated Blog #%s", id);
//    }
//
//    @DeleteMapping(value="/deleteBlog/{id}")
//    public String deleteBlog(@PathVariable long id) {
//        blogRepo.deleteById(id);
//        return String.format("Deleted Blog #%s", id );
//    }
}
