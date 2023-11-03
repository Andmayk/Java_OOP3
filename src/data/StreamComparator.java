package data;

import java.util.Comparator;

//— Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {

        if (stream1.getStudentGroups().size() < stream2.getStudentGroups().size()) {
            return -1;
        } else {
            if (stream1.getStudentGroups().size() > stream2.getStudentGroups().size()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}