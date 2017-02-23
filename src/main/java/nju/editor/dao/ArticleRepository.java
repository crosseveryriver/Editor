package nju.editor.dao;

import nju.editor.model.Article;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by river on 2/23/17.
 */
public interface ArticleRepository extends CrudRepository<Article,Long> {
}
