package edu.cursor.services;

import edu.cursor.dao.AccountRepository;
import edu.cursor.dto.AccountDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements AccountsService {

    private final AccountRepository accountRepository;


    @Override
    public List<AccountDto> allAccounts() {

        return null;
//                .findAll()
//                .stream()
//                .map( classObj -> AccountDto
//                        .builder()
//                        .teacherName( classObj.getTeacher().getName() )
//                        .teacherId( classObj.getTeacher().getId() )
//                        .numberOfStudents( classObj.getStudents().size() )
//                        .classId( classObj.getId() )
//                        .courseId( classObj.getCourse().getId() )
//                        .courseName( classObj.getCourse().getName() )
//                        .year( classObj.getYear() )
//                        .build()
//                )
//                .collect(Collectors.toList());
    }

}
