package jp.co.nagura.sample.catalog.mappers.beans;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    // ID
    private Integer personId;

    // 名前
    private String personName;

    // コメント
    private String comment;

    // 動物
    private Animal animal;

    // 登録日時
    private LocalDateTime insDt;

    // 更新日時
    private LocalDateTime updDt;

}
