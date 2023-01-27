//Создать пекедж terminal. Дальнейшие работы ведем в нем
//        - Создать интерфейс CommandParser c методом
//        String[] parseCommand (String inputCommand)
//       - Создать класс TerminalReader, который содержит переменную CommandParser и метод,
//       который в бесконечном цикле слушает команды с помощью Scanner(System.in)

package terminal;

import java.util.List;

public class CommandParser extends Command {
    public CommandParser(List<String> argumets, String mainFirstCommand) {
        super(argumets, mainFirstCommand);
    }

    Command parseCommand (String inputCommand){
        if inputCommand = ;
//        if inputCommand = isCreateCommand();
//            return  isCreateCommand();
//        else;
//        return isDeleteCommand();
    }
}
