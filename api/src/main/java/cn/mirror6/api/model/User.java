package cn.mirror6.api.model;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author mirror6
 * @since 2020-05-04
 */
@Data
@Builder
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String account;

    private String password;

    private String salt;

    private String name;

    private Long gender;

    private String tel;

    private String email;

}
