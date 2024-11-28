package org.zerock.wq.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoService {
	//조회
	public TodoDTO get(Long tno) {
		TodoDTO dto = new TodoDTO();
		dto.setTno(tno);
		dto.setTitle("SampleTodo:");
		dto.setDueDate(LocalDate.now());
		dto.setFinished(true);
		return dto;
	}
	
	//등록
	public void register(TodoDTO todoDTO) {
		System.out.println("등록 할려는 내용은"+todoDTO);
	}
	//수정
	
	//삭제
	
	//목록

	public List<TodoDTO> getList() {
		List<TodoDTO> todoDTOS = new ArrayList<>();
		for(int i=0; i<10; i++) {
			TodoDTO dto = new TodoDTO();
			dto.setTno((long)i);
			dto.setTitle("Todo.."+i);
			dto.setDueDate(LocalDate.now());
			todoDTOS.add(dto); //추가해라(덮어쓰기 아님)
			//System.out.println(todoDTOS.add(dto));
			System.out.println("서비스"+todoDTOS);
		}
		return todoDTOS;
		
		
	}
}
