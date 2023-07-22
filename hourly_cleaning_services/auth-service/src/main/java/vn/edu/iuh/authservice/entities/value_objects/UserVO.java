package vn.edu.iuh.authservice.entities.value_objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserVO {
    private String id;
    private String password;
//    private Set<> role = "ADMIN";
    private String phone;
    private boolean gender;
}
