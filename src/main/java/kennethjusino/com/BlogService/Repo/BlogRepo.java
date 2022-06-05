package kennethjusino.com.BlogService.Repo;

import kennethjusino.com.BlogService.Models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<Blog, Long> {
}
