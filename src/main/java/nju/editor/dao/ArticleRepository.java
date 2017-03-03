package nju.editor.dao;

import nju.editor.model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by river on 2/23/17.
 */
public interface ArticleRepository extends CrudRepository<Article,Long> {
    List<Article> getArticleByVersion(String version);
    List<Article> getArticleByTypeAndVersion(String type,String version);
}
