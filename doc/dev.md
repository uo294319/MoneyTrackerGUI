# DEVELOPMENT STATUS

## GUI ideas
1. Window, components & events
   1. Main windown menu bar:
      - File
        - Open
        - Open sample
        - Import from csv
        - Export in csv
        - Close
      - Edit
        - Add entries
        - Clear all entries
      - View
        - Radial button (All, Expenses, Income)
        - Period -> Radial button (Total, Anual, Month, Custom)
      - Help
        - Documentation (link to github docs)
        - About (link to github readme)
   2. Different layouts (Main -Tabbed pannel - All/Expenses/Income)
   3. Actions
      - View -> Modifies entries shown
   4. Keyboard restrictions
      - Only allows alphanumeric values in description.
      - Only allows +/- and digits in mov.
      - Only allows 20 char in description.
   5. List inside of tabbed pannel (all/expenses/income)
      - Modified with buttons left (Add, delete, Mod)
      - Also with main menu -> File -> add entry, delete all entries 
2. Multiple windows
   1. Main -> Secondary
      - Show all button shows the complete list with income/expenses from main window.
   2. Secondary -> Main
      - Add entries button opens secondary window (allows multiple entries)
   3. Secondary -> Secondary
      - Add entries secondary window modifies Show all secondary window
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
- [ ] (1.1) A Menu bar including menu items and sub-menus
- [ ] (1.2) Components on a layout which is not the default one.
- [ ] (1.3) Events: Components are modified when the user does an action.
- [ ] (1.4) Keyboard events
- [ ] (1.5) Update components with a variable number of elements.

### Multiple windows
- [ ] (2.1) The main window changes/updates components of a secondary window.
- [ ] (2.2) A secondary window changes/updates components of the main window.
- [ ] (2.3) A secondary window changes/updates components of another secondary window.
- [ ] (2.4) The initial window is not the main window.

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
        - [ ] Open sample
        - [ ] Import from csv
        - [ ] Export in csv
        - [ ] Close
    - Edit
        - [ ] Add entries
        - [ ] Clear all entries
    - View
        - [ ] Wallet -> Radial (Total, Expenses, Income)
        - [ ] Period -> Radial (All, Anual, Month, Custom)
        - [ ] Show date (Checkbox)
        - [ ] Show tag (Checkbox)
    - Help
        - [ ] Documentation (link to github docs)
        - [ ] About (link to github readme)