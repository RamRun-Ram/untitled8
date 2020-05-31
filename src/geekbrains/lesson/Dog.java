package geekbrains.lesson;

public class Dog extends Animal {

    Dog(int runLength, int swimLenght,double jumpHeight) {
        super(runLength, swimLenght, jumpHeight);
    }

          boolean run(int runLength)
        {
            if (runLength <= 500)
            {
                return true;
            }
            return false;
        }
    boolean jump(double jumpHeight)
    {
        if (jumpHeight < 0.5)
        {
            return true;
        }
        return false;
    }
    boolean swim(int swimLenght)
    {
        if (swimLenght <= 10)
        {
            return true;
        }
        return false;
    }
    boolean run2(int runLength)
    {
        if (runLength <= 400)
        {
            return true;
        }
        return false;
    }
    }

