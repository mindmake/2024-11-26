package org.zerock.wq.todo;

import java.time.LocalDate;

import lombok.Data;

//76
@Data
public class TodoDTO {
	private Long  tno;
	private String title;
	private LocalDate dueDate;
	private boolean finished;
}
