# DEVELOPMENT STATUS

## GUI ideas
1. Window, components & events
   1. Main windown menu bar:
      - File
        - Open sample
        - Import from csv
        - Export in csv
        - Quit
      - Edit
        - Auto-save
        - Save to cloud
        - Undo
        - Add entry
        - Clear all entries
      - View
        - Wallet -> Radial button (All, Expenses, Income)
        - Customize view
      - Help
        - Documentation
        - About
  
   2. Different layouts
      - Both JFrame and mainPanel use AbsoluteLayout.

> [!NOTE]
> Resize is not allowed in some windows as it breaks the distribution of the components.

   3. Events
      - "View/Wallet" radio buttons are synchronized with the tabbed pannel.
      - "Open sample" adds some predefined enties to the table
    
   4. Keyboard restrictions (inside add entry window)
      - Only allows digits and one dot in the amount.
      - Only allows letters and numbers in the tag.
  
   5. Dynamic tables inside each element (all/expenses/income) of the tabbed pannel.
      - Modified with buttons left (Add, delete, Mod)
      - Also with main menu -> File -> "Add entry", "Clear all entries". 

1. Multiple windows
   1. Main -> Secondary
      - "Show all" button shows a secondary window with the complete list with income/expenses from main window (same tables model).
      - Tabbed pane tab selection and Menu/View/Wallet radio buttons also affects "show all" window.
   2. Secondary -> Main
      - Tabbed pane tab selection in "show all" window also affects main tabbed pane and Menu/View/Wallet radio buttons.
   3. Secondary -> Secondary
      - Menu/view/Customize view opens a secondary window that modifies appearance in every other window (including main window and secondary ones).

> [!NOTE]
> Only change color for tables was implemented.

   4. Initial window -> Welcome window


3. Dialogs
   1. Use JOptionPane 
      - Import/Export csv always gives an error using JOptionPane.
      - Unimplemented operations as "delete entry" or "modify entry" show a warning message.
   2. Use predefined dialogs
      - Use file chooser for importing and exporting csv.
      - Use color chooser in "CustomView" window and "About" windows.
   3. "Add entry" button opens a custom dialog (allows only one entry).


4. Graphics
   1. Custom class & `paint()` method.
      - "Help/About" opens a window that contains a canvas panel where to draw.
      - This canvas is an instance of a custom swing JPanel.
   2. Dynamic Graphics. 
      - The color of the drawings can be changed.
   3. Explicit Repainting.
      - When the color is selected the `repaint` method is called.

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

--- 

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