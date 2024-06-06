package com.sparta.igeomubwotna.entity;

import com.sparta.igeomubwotna.dto.CommentRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "comment")
@NoArgsConstructor
public class Comment extends Timestamped{

    /* Column */
    //ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //내용
    @Column(nullable = false)
    private String content;

    //좋아요 수
    @Column(nullable = false)
    private Long likeCount;

    /* Mapping */
    //작성자 ID
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    //레시피 ID
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipeId")
    private Recipe recipe;

    /* Constructor */
    public Comment(CommentRequestDto requestDto, Recipe recipe, User user) {
        this.content = requestDto.getContent();
        this.likeCount = requestDto.getLikeCount();
        this.recipe = recipe;
        this.user = user;
    }

    /* comment 수정 메서드 */
    public void update(String content) {
        this.content = content;
    }
}
