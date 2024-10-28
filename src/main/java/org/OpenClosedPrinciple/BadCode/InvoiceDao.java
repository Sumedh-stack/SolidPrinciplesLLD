package org.OpenClosedPrinciple.BadCode;

/**
 * Now see we have different calss for different functionalities now I want to add suppose
 * to save in sqldatabase i have to extend it no need to modify the code
 */
 interface InvoiceDao {
     public void save(Invoice invoice);
}

class DataBaseInvoiceDao implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {

    }
}

class FileInvoiceDao implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {

    }
}
