public static void keepCareOfMyAccount(BankAccount account) { /* ... */ }

BankAccount account = new BankAccount();
account.addSavings(100);
keepCareOfMyAccount(account);
// Account might be empty (or magically filled)
