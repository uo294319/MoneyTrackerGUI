# DEVELOPMENT STATUS

## Requirements Completed

### Window, components & events
- [x] (1.1) A Menu bar including menu items and sub-menus
- [x] (1.2) Components on a layout which is not the default one.
- [x] (1.3) Events: Components are modified when the user does an action.
- [x] (1.4) Keyboard events
- [x] (1.5) Update components with a variable number of elements.

### Multiple windows
- [x] (2.1) The main window changes/updates components of a secondary window.
- [x] (2.2) A secondary window changes/updates components of the main window.
- [x] (2.3) A secondary window changes/updates components of another secondary window.
- [x] (2.4) The initial window is not the main window.

### Dialogs
- [x] (3.1) A dialog using JOptionPane.
- [x] (3.2) A predefined dialog (such as choosing files or colour).
- [x] (3.3) A user dialog asking the user for any information which is used in one of the 
windows

### Graphics
- [x] (4.1) A child class from a component redefining its paint method.
- [x] (4.2) Set methods to change something that is being drawn.
- [x] (4.3) Use the method repaint explicitly.


## GUI ideas
### Window, components & events
   1. **Main windown menu bar**
      - File
        - Open sample
        - Import from csv (partial implementation)
        - Export in csv (partial implementation)
        - Quit
      - Edit
        - Auto-save (no implementation)
        - Save to cloud (no implementation)
        - Undo (no implementation)
        - Add entry
        - Clear all entries
      - View
        - Wallet -> Radio button (All, Expenses, Income)
        - Customize view
      - Help
        - Documentation (no implementation)
        - About
  
   2. **Different layouts**
      - `ShowAll` window uses BoxLayout.
      - Both `mainWindow` (`mainPanel`) and `welcomeWindow` use AbsoluteLayout.

> [!NOTE]
> Resize is not allowed in some windows as it breaks the desired distribution of the components.

   3. **Events**
      - Many events are implemented in this project. Some of them are:
        - `View/Wallet` radio buttons are synchronized with the tabbed pannel.
        - `File/Open sample` adds some predefined enties to the tables.
        - `File/Quit` exits the app.
    
   4. **Keyboard restrictions**
      - Inside the `AddEntry` window:
        - Only digits and one dot are allowed as amount.
        - Only letters and numbers are allowed as tag.
> [!NOTE]
> Blank tag is allowed in in the text area, but not in the tables as it will be replaced by `<No Tag>`.
  
   5. **Components with variable number of elements**
      - There are Dynamic tables inside each element (all/expenses/income) of the tabbed pannel.
      - The tables are modified with the buttons on the left (Add, delete and Mod. Entry)
      - Also modified with main menu `Edit/Add entry` and `Edit/Clear all entries`.

> [!CAUTION]
> Functionality of buttons delete and Mod. Entry is not implemented.

### Multiple windows
Secondary windows created are:
- `ShowAllWindow`. Opened with the button `Show  All` in the main window.
- `CustomViewWindow`. Opened with the menu bar in `View/Customize View` menu item.
- `AboutWindow`. Opened with the menu bar in `Help/About` menu item.
- `WelcomeWindow`. Displayes only once at the beginning of a session.


   1. **Main updates secondary**
      - `ShowAllWindow` contains the same tables as the main window (same tables model).
      - `MainWindow` tabbed pane selection and `Menu/View/Wallet` radio buttons also affects `ShowAllWindow`.
   2. **Secondary updates main**
      - Tabbed pane selection in `ShowAllWIndow` also affects `MainWindow` tabbed pane and `Menu/View/Wallet` radio buttons.
   3. **Secondary updates secondary**
      - `CustomViewWindow` change tables color modifies the color of the tables in `MainWindow` and `ShowAllWindow`.
   4. **Initial Window**
      - `WelcomeWindow` is the first and only window shown until the `Begin` button is pressed.
      - Once pressed `MainWindow` will appear and `WelcomeWindow` will not be accessible again.

> [!CAUTION]
> In `CustomViewWindow`, change color for background and buttons was not implemented. Only implemented for tables.


### Dialogs
   1. **Dialog with JOptionPane**
      - `File/Import csv` and `File/Export csv` always gives an error using JOptionPane.
      - Unimplemented operations show a warning message (as `Delete Entry`).
   2. **Predefined dialogs**
      - A file chooser is used for importing and exporting csv.
      - A color chooser for changing colors in `CustomViewWindow` and `AboutWindow`.
   3. **Custom dialog**
      - `Add Entry` button opens a custom dialog that allows introducing an entry to the tables.


### Graphics
   1. **Custom class & `paint()` method**
      - `AboutWindow` contains a canvas panel where to draw.
      - This canvas is an instance of a custom `java.swing.JPanel` with its `paint()` method redefined.
   2. **Use set methods**
      - `setColor()` was used to change the color of the drawings.
   3. **Explicit Repainting**
      - When the color is selected the `repaint` method is called.
  
> [!NOTE]
> Note that resizing will automaticly call the `repaint()` method.


## TODO list

- Add funtionality to menu bar
  - File
    - [x] Open sample
    - [x] Import from csv
    - [x] Export in csv
    - [x] Quit
  - Edit
    - [ ] Auto-save
    - [ ] Save to cloud
    - [ ] Undo
    - [x] Add entry
    - [x] Clear all entries
  - View
    - [x] Wallet -> Radial (Total, Expenses, Income)
    - [x] Customize view
  - Help
    - [ ] Documentation (link to github docs)
    - [x] About (link to github readme)
  
- Add functionality to buttons
  - [x] Add entry
  - [ ] Delete entry
  - [ ] Modify entry
  - [x] Show All

- Custom view functionalities
  - [ ] Change Background Color
  - [x] Change Tables Color
  - [ ] Change Buttons Color
  - [x] Apply
  - [x] Set Default