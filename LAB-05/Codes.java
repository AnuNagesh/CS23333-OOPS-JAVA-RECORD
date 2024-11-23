CODE-1:

PROGRAM:
Using BankAccount class implement method overriding.
CODE:
import java.text.DecimalFormat;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Minimum balance of $100 required!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DecimalFormat dfWithOneDecimal = new DecimalFormat("#.#");
        DecimalFormat dfWithoutDecimal = new DecimalFormat("#");

        BankAccount ba = new BankAccount("BA1234", 500.0);
        System.out.println("Create a Bank Account object (A/c No. " + ba.getAccountNumber() + ") with initial balance of $" + dfWithoutDecimal.format(ba.getBalance()) + ":");

        ba.deposit(1000);
        System.out.println("Deposit $1000 into account " + ba.getAccountNumber() + ":");
        System.out.println("New balance after depositing $1000: $" + dfWithOneDecimal.format(ba.getBalance())+".0");

        ba.withdraw(600);
        System.out.println("Withdraw $600 from account " + ba.getAccountNumber() + ":");
        System.out.println("New balance after withdrawing $600: $" + dfWithOneDecimal.format(ba.getBalance())+".0");

        SavingsAccount sa = new SavingsAccount("SA1000", 300.0);
        System.out.println("Create a SavingsAccount object (A/c No. " + sa.getAccountNumber() + ") with initial balance of $" + dfWithoutDecimal.format(sa.getBalance()) + ":");

        System.out.println("Try to withdraw $250 from SA1000!");
        sa.withdraw(250);
        System.out.println("Balance after trying to withdraw $250: $" + dfWithOneDecimal.format(sa.getBalance())+".0");
    }
}

CODE-2:

PROGRAM:
Write a program for college admission using class.
CODE:
class College {
    String collegeName;

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    public void admitted() {
        System.out.println("A student admitted in " + collegeName);
    }
}

class Student extends College {
    String studentName;
    String department;

    public Student(String collegeName, String studentName, String department) {
        super(collegeName);
        this.studentName = studentName;
        this.department = department;
    }

    public void Course() {
        System.out.println("CollegeName : " + collegeName);
        System.out.println("StudentName : " + studentName);
        System.out.println("Department : " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("REC", "Venkatesh", "CSE");
        student.admitted();
        student.Course();
    }
}

CODE-3:
PROGRAM:
Create a class Mobile and implement inheritance.
CODE:
class Mobile {
    public Mobile() {
        System.out.println("Basic Mobile is Manufactured");
    }
}

class CameraMobile extends Mobile {
    public CameraMobile() {
        System.out.println("Camera Mobile is Manufactured");
    }

    public void newFeature() {
        System.out.println("Camera Mobile with 5MG px");
    }
}

class AndroidMobile extends CameraMobile {
    public AndroidMobile() {
        System.out.println("Android Mobile is Manufactured");
    }

    public void androidMobile() {
        System.out.println("Touch Screen Mobile is Manufactured");
    }
}

public class Main {
    public static void main(String[] args) {
        AndroidMobile androidMobile = new AndroidMobile();
        androidMobile.newFeature();
        androidMobile.androidMobile();
    }
}
