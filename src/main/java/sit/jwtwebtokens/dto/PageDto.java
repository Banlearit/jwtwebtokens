package sit.jwtwebtokens.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class PageDto<T> {
    private List<T> content;
    private Boolean last;
    private Boolean first;
    private Integer totalPages;
    private Integer totalElements;
    private Integer size;
    @JsonIgnore
    private Integer number;

    public Integer getPage() {return number;
    }
}
