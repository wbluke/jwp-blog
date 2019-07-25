package techcourse.myblog.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import techcourse.myblog.domain.Article;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ArticleSaveParams {
    private String title;
    private String coverUrl;
    private String contents;

    public Article toEntity() {
        return Article.builder()
                .title(title)
                .coverUrl(coverUrl)
                .contents(contents)
                .build();
    }
}
