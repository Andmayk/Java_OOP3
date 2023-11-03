package data;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private int indexIterator;
    private final List<StudentGroup> studentGroups;

    public StreamIterator(Stream stream) {
        this.studentGroups = stream.getStudentGroups();
        this.indexIterator = 0;
    }

    @Override
    public boolean hasNext() {
        return (indexIterator < studentGroups.size());
    }

    @Override
    public StudentGroup next() {
        if (hasNext()){
            return studentGroups.get(indexIterator++);
        }
        return null;
    }

    @Override
    public void remove() {
        studentGroups.remove(--indexIterator);
    }
}
