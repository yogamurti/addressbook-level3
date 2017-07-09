package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

/**
 * Implements dependency injection.
 * All its methods does nothing.
 */

public class StorageStub extends Storage{

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        return null;
    }

    @Override
    public String getPath() {
        return null;
    }

}
