package AggregationAndComposition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex_4 {
    public static void main(String[] args) {
        class Account {
            private int id;
            private double balance;
            private boolean blocked;

            public Account(int id, double balance) {
                this.id = id;
                this.balance = balance;
                this.blocked = false;
            }

            public int getId() {
                return id;
            }

            public double getBalance() {
                return balance;
            }

            public boolean isBlocked() {
                return blocked;
            }

            public void setBlocked(boolean blocked) {
                this.blocked = blocked;
            }
        }

        class Client {
            private String name;
            private List<Account> accounts;

            public Client(String name) {
                this.name = name;
                this.accounts = new ArrayList<>();
            }

            public void addAccount(Account account) {
                accounts.add(account);
            }

            public List<Account> getAccounts() {
                return accounts;
            }

            public double getTotalBalance() {
                double totalBalance = 0;
                for (Account account : accounts) {
                    totalBalance += account.getBalance();
                }
                return totalBalance;
            }

            public double getPositiveBalanceSum() {
                double positiveBalanceSum = 0;
                for (Account account : accounts) {
                    if (account.getBalance() > 0) {
                        positiveBalanceSum += account.getBalance();
                    }
                }
                return positiveBalanceSum;
            }

            public double getNegativeBalanceSum() {
                double negativeBalanceSum = 0;
                for (Account account : accounts) {
                    if (account.getBalance() < 0) {
                        negativeBalanceSum += account.getBalance();
                    }
                }
                return negativeBalanceSum;
            }

            public void sortAccountsById() {
                Collections.sort(accounts, (a1, a2) -> Integer.compare(a1.getId(), a2.getId()));
            }
        }

        class Bank {
            private List<Client> clients;

            public Bank() {
                this.clients = new ArrayList<>();
            }

            public void addClient(Client client) {
                clients.add(client);
            }

            public List<Account> searchAccountsByClientName(String clientName) {
                List<Account> result = new ArrayList<>();
                for (Client client : clients) {
                    if (client.name.equals(clientName)) {
                        result.addAll(client.getAccounts());
                    }
                }
                return result;
            }
        }

        Account account1 = new Account(1, 1000);
        Account account2 = new Account(2, -500);
        Account account3 = new Account(3, 2000);

        Client client1 = new Client("John");
        client1.addAccount(account1);
        client1.addAccount(account2);

        Client client2 = new Client("Alice");
        client2.addAccount(account3);

        Bank bank = new Bank();
        bank.addClient(client1);
        bank.addClient(client2);

        List<Account> johnAccounts = bank.searchAccountsByClientName("John");
        System.out.println("John's accounts:");
        for (Account account : johnAccounts) {
            System.out.println("Account ID: " + account.getId() + ", Balance: " + account.getBalance());
        }

        client1.sortAccountsById();
        System.out.println("John's sorted accounts by ID:");
        for (Account account : johnAccounts) {
            System.out.println("Account ID: " + account.getId() + ", Balance: " + account.getBalance());
        }

        double totalBalance = client1.getTotalBalance();
        double positiveBalanceSum = client1.getPositiveBalanceSum();
        double negativeBalanceSum = client1.getNegativeBalanceSum();
        System.out.println("John's total balance: " + totalBalance);
        System.out.println("John's positive balance sum: " + positiveBalanceSum);
        System.out.println("John's negative balance sum: " + negativeBalanceSum);
    }
}
