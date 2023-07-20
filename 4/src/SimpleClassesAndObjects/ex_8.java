package SimpleClassesAndObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex_8 {
    public static void main(String[] args) {
        class Customer {
            private int id;
            private String lastName;
            private String firstName;
            private String patronymic;
            private String address;
            private String creditCardNumber;
            private String bankAccountNumber;

            public Customer(int id,
                            String lastName,
                            String firstName,
                            String patronymic,
                            String address,
                            String creditCardNumber,
                            String bankAccountNumber) {
                this.id = id;
                this.lastName = lastName;
                this.firstName = firstName;
                this.patronymic = patronymic;
                this.address = address;
                this.creditCardNumber = creditCardNumber;
                this.bankAccountNumber = bankAccountNumber;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getPatronymic() {
                return patronymic;
            }

            public void setPatronymic(String patronymic) {
                this.patronymic = patronymic;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getCreditCardNumber() {
                return creditCardNumber;
            }

            public void setCreditCardNumber(String creditCardNumber) {
                this.creditCardNumber = creditCardNumber;
            }

            public String getBankAccountNumber() {
                return bankAccountNumber;
            }

            public void setBankAccountNumber(String bankAccountNumber) {
                this.bankAccountNumber = bankAccountNumber;
            }

            @Override
            public String toString() {
                return "Customer{" +
                        "id=" + id +
                        ", lastName='" + lastName + '\'' +
                        ", firstName='" + firstName + '\'' +
                        ", patronymic='" + patronymic + '\'' +
                        ", address='" + address + '\'' +
                        ", creditCardNumber='" + creditCardNumber + '\'' +
                        ", bankAccountNumber='" + bankAccountNumber + '\'' +
                        '}';
            }
        }

        class CustomerDatabase {
            private List<Customer> customers;

            public CustomerDatabase() {
                customers = new ArrayList<>();
            }

            public void addCustomer(Customer customer) {
                customers.add(customer);
            }

            public List<Customer> getCustomers() {
                return customers;
            }

            public List<Customer> getCustomersSortedByName() {
                List<Customer> sortedCustomers = new ArrayList<>(customers);
                Collections.sort(sortedCustomers, (c1, c2) -> c1.getLastName().compareTo(c2.getLastName()));
                return sortedCustomers;
            }

            public List<Customer> getCustomersByCreditCardRange(String startRange, String endRange) {
                List<Customer> result = new ArrayList<>();
                for (Customer customer : customers) {
                    String creditCardNumber = customer.getCreditCardNumber();
                    if (creditCardNumber.compareTo(startRange) >= 0 && creditCardNumber.compareTo(endRange) <= 0) {
                        result.add(customer);
                    }
                }
                return result;
            }
        }

        CustomerDatabase database = new CustomerDatabase();

        database.addCustomer(new Customer(1, "Иванов", "Иван", "Иванович", "Москва", "1111222233334444", "1234567890"));
        database.addCustomer(new Customer(2, "Петров", "Петр", "Петрович", "Санкт-Петербург", "2222333344445555", "0987654321"));
        database.addCustomer(new Customer(3, "Сидоров", "Алексей", "Иванович", "Казань", "3333444455556666", "1357924680"));
        database.addCustomer(new Customer(4, "Федоров", "Дмитрий", "Сергеевич", "Новосибирск", "4444555566667777", "2468135790"));

        System.out.println("Список покупателей в алфавитном порядке:");
        List<Customer> sortedCustomers = database.getCustomersSortedByName();
        for (Customer customer : sortedCustomers) {
            System.out.println(customer);
        }

        System.out.println("\nСписок покупателей с номером кредитной карты в заданном интервале:");
        List<Customer> customersInRange = database.getCustomersByCreditCardRange("2000000000000000", "4000000000000000");
        for (Customer customer : customersInRange) {
            System.out.println(customer);
        }
    }
}
