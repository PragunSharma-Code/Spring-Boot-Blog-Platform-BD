package com.devtiro.blog.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateTagRequest {

    @NotEmpty(message = "Atleast one tag name is required!")
    @Size(max = 10, message = "Maximum {max} tags is allowed")

    private Set<
            @Size(min = 2, max = 30, message = "Tag name must be in between {min} and {max} characters")
            @Pattern(regexp = "^[\\w\\s-]+$", message = "Tag names can only contain letters, numbers , spaces , hyphens")
                    String> names;

}
