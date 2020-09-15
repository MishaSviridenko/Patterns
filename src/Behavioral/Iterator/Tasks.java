package Behavioral.Iterator;

public class Tasks implements Container {
    String[] tasks = {"Build a house", "Bring up son", "Make tree"};

    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator {
        int index = 0;

        public boolean hasNext() {
            if (index < tasks.length) {
                return true;
            }
            return false;
        }

        public Object next() {
            return tasks[index++];
        }
    }
}
