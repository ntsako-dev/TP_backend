package SchoolPicker.repositories.Impl;

import SchoolPicker.Domain.Subject;
import SchoolPicker.repositories.SubjectRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kino on 2017-08-13.
 */
public class SubjectrepositoryImpl implements SubjectRepository
{
    private static SubjectrepositoryImpl respository = null;

    private Map<Long,Subject> subjectTable;

    private SubjectrepositoryImpl() {
        subjectTable = new HashMap<Long, Subject>();
    }

    public static SubjectrepositoryImpl getInstance(){
        if(respository==null)
            respository = new SubjectrepositoryImpl();
        return respository;
    }

    public Subject create(Subject subject) {
        subjectTable.put(subject.getSubjectId(),subject);
        Subject savedSubject = subjectTable.get(subject.getSubjectId());
        return savedSubject;
    }

    public Subject read(Long id) {
        Subject subject = subjectTable.get(id);
        return subject;
    }

    public Subject update(Subject subject) {
        subjectTable.put(subject.getSubjectId(),subject);
        Subject savedSubject = subjectTable.get(subject.getSubjectId());
        return savedSubject;
    }

    public void delete(Long id) {
        subjectTable.remove(id);

    }



}
