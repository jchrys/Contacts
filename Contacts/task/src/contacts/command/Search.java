package contacts.command;

import contacts.command.entity.CommandContext;
import contacts.command.entity.SearchResult;
import contacts.entity.PhoneBook;
import contacts.util.UIConstants;
import contacts.util.UIUtil;

import java.util.List;
import java.util.stream.IntStream;

public class Search implements Command, PhoneBookHolder {
    private PhoneBook phoneBook;

    @Override
    public CommandContext execute() {
        String query = UIUtil.getLine(UIConstants.ENTER_SEARCH_QUERY);

        List<SearchResult> searchResults = phoneBook.search(query);

        UIUtil.println(String.format(UIConstants.FOUND, searchResults.size()));
        IntStream.range(0, searchResults.size())
                .forEach(idx -> UIUtil.println(String.format("%d. %s", idx + 1, searchResults.get(idx).getContact().getSimpleName())));

        String action = UIUtil.getAction("search", "[number]", "back", "again");
        if ("back".equals(action)) {
            return CommandContext.of("menu");
        }
        if ("again".equals(action)) {
            return CommandContext.of("search");
        }
        int searchIdx = Integer.parseInt(action) - 1;
        return CommandContext.of("record", searchResults.get(searchIdx).getIndex());
    }

    @Override
    public void setPhoneBook(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }
}

