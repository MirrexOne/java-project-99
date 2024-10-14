package hexlet.code.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

public class TaskDto {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {

        private Long index;

        @NotNull
        @JsonProperty("assignee_id")
        private Long assigneeId;

        @NotBlank
        private String title;

        private String content;

        @NotBlank
        private String status;

        private Set<Long> labelIds;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {

        private Long id;

        private Long index;

        private LocalDate createdAt;

        @JsonProperty("assignee_id")
        private Long assigneeId;

        private String title;

        private String content;

        private String status;

        private Set<Long> labelIds;
    }
}
