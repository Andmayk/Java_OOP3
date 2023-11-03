package data;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

//Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
public class Stream implements Iterable<StudentGroup> {
    private String streamName;
    private List<StudentGroup> studentGroups;
    public Stream(String streamName, List<StudentGroup> studentGroups) {
        this.streamName = streamName;
        this.studentGroups = studentGroups;
    }
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void addStudentGroups(StudentGroup studentGroup) {
        studentGroups.add(studentGroup);
    }
    @Override
    public StreamIterator iterator() {
        return new StreamIterator(this);
    }

    @Override
    public Spliterator<StudentGroup> spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public String toString() {
        return "Stream {" +
                "streamName=" + streamName +
                "\n\t  studentGroups=" + studentGroups +
                '}';
    }

}
