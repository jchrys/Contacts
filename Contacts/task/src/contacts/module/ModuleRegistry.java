package contacts.module;

import java.util.Arrays;

public enum ModuleRegistry {
    COUNT(new CountModule()),
    ADD(new AddModule()),
    LIST(new ListModule()),
    REMOVE(new RemoveModule()),
    EDIT(new EditModule()),
    ;

    ModuleRegistry(Module module) {
        this.module = module;
    }

    private final Module module;

    public Module getModule() {
        return this.module;
    }

    public static Module findByName(String name) {
        return Arrays.stream(values())
                .filter(each -> each.name().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new).getModule();
    }

}
