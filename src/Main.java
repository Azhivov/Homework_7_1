public class Main {
    public static void main(String[] args){

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("��� ���������� -%s\n", fullName);

        System.out.println("������ ��� ���������� ��� ���������� ������� -" + fullName.toUpperCase());

        fullName = "������ ���� ��������";
        System.out.println(fullName.replace("�","�"));
    }
}