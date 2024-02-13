# DEVELOPMENT STATUS

## GUI ideas
1. Window, components & events
   1. Main windown menu bar:
      - File
        - Open
        - Open sample
        - Import from csv
        - Export in csv
        - Quit
      - Edit
        - Auto-save
        - Save to cloud
        - Undo
        - Add entries
        - Clear all entries
      - View
        - Wallet -> Radial button (All, Expenses, Income)
        - Customize view
      - Help
        - Documentation (link to github docs)
        - About (link to github readme)
  
   2. Different layouts
      - Both JFrame and mainPanel use AbsoluteLayout.

> [!NOTE]
> Resize is not allowed as it breaks the distribution of GUI components.

   3. Actions
      - View modifies entries shown
        - Wallet synchronized with the tabbed pannel.
    
   4. Keyboard restrictions
      - Only allows alphanumeric values in description.
      - Only allows +/- and digits in mov.
      - Only allows 20 char in description.
  
   5. Dynamic tables inside each element (all/expenses/income) of the tabbed pannel.
      - Modified with buttons left (Add, delete, Mod)
      - Also with main menu -> File -> add entry, delete all entries 

1. Multiple windows
   1. Main -> Secondary
      - "Show all" button shows a secondary window with the complete list with income/expenses from main window (same tables model).
      - Tabbed pane tab selection and Menu/View/Wallet radio buttons also affects "show all" window.
   2. Secondary -> Main
      - Tabbed pane tab selection in "show all" window also affects main tabbed pane and Menu/View/Wallet radio buttons.
      - Add entries button opens secondary window (allows multiple entries)
   3. Secondary -> Secondary
      - Menu/view/Customize view opens a secondary window that modifies appearance in every other window (including main window and secondary ones).

> [!NOTE]
> Only change color for tables was implemented.

   4. Initial window -> Welcome window


3. Dialogs
   1. Use JOptionPane for confirmation on "delete entry" and "delete all" options.
   2. Use file chooser for importing and exporting csv.
   3. Mod. entry button opens a custom dialog (allows only one entry).


4. Graphics (**some charts window**)
   1. Custom Graphics. Custom Drawing:
      Create a custom component (e.g., a chart) to visualize financial data.
      Override the paintComponent method to draw relevant graphics.
   2. Dynamic Graphics. Change Drawn Elements:
      Implement methods to update what is being drawn (e.g., highlight specific expenses, adjust chart scales).
   3. Repainting. Explicit Repainting:
      Use the repaint() method to refresh custom graphics when data changes.

## Requirements Completed

### Window, components & events
- [x] (1.1) A Menu bar including menu items and sub-menus
- [x] (1.2) Components on a layout which is not the default one.
- [x] (1.3) Events: Components are modified when the user does an action.
- [ ] (1.4) Keyboard events
- [x] (1.5) Update components with a variable number of elements.

### Multiple windows
- [x] (2.1) The main window changes/updates components of a secondary window.
- [x] (2.2) A secondary window changes/updates components of the main window.
- [ ] (2.3) A secondary window changes/updates components of another secondary window.
- [x] (2.4) The initial window is not the main window.

### Dialogs
- [ ] (3.1) A dialog using JOptionPane.
- [ ] (3.2) A predefined dialog (such as choosing files or colour).
- [ ] (3.3) A user dialog asking the user for any information which is used in one of the 
windows

### Graphics
- [ ] (4.1) A child class from a component redefining its paint method.
- [ ] (4.2) Set methods to change something that is being drawn.
- [ ] (4.3) Use the method repaint explicitly.

--- 

## TODO list

- Add funtionality to menu bar
  - File
    - [ ] Open
    - [x] Open sample
    - [ ] Import from csv
    - [ ] Export in csv
    - [x] Quit
  - Edit
    - [ ] Auto-save
    - [ ] Save to cloud
    - [ ] Undo
    - [ ] Add entries
    - [x] Clear all entries
  - View
    - [x] Wallet -> Radial (Total, Expenses, Income)
    - [ ] Customize view
  - Help
    - [ ] Documentation (link to github docs)
    - [ ] About (link to github readme)
  
- Add functionality to buttons
  - [ ] Add entries
  - [ ] Delete entry
  - [ ] Modify entry
  - [x] Show All

- Custom view functionalities
  - [ ] Change Background Color
  - [x] Change Tables Color
  - [ ] Change Buttons Color
  - [x] Apply
  - [x] Set Default