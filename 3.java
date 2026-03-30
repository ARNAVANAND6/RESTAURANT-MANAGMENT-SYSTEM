// DATA STORAGE
const ALLERGENS_DATA = [
  {id: 1, name: 'Dairy', type: 'Protein'},
  {id: 2, name: 'Nuts', type: 'Protein'},
  {id: 3, name: 'Gluten', type: 'Carbohydrate'},
  {id: 4, name: 'Eggs', type: 'Protein'},
  {id: 5, name: 'Shellfish', type: 'Protein'},
  {id: 6, name: 'Soy', type: 'Protein'},
  {id: 7, name: 'Fish', type: 'Protein'},
  {id: 8, name: 'Sesame', type: 'Seed'},
  {id: 9, name: 'Mustard', type: 'Seed'},
  {id: 10, name: 'Peanuts', type: 'Protein'}
];

const DIETARY_TYPES = [
  {id: 1, name: 'Vegetarian'},
  {id: 2, name: 'Non-Vegetarian'},
  {id: 3, name: 'Vegan'},
  {id: 4, name: 'Jain'},
  {id: 5, name: 'Eggetarian'},
  {id: 6, name: 'Pescatarian'}
];

const INGREDIENTS_DATA = [
  {id: 1, name: 'Paneer', allergens: [1]},
  {id: 2, name: 'Butter', allergens: [1]},
  {id: 3, name: 'Cream', allergens: [1]},
  {id: 4, name: 'Milk', allergens: [1]},
  {id: 5, name: 'Cashews', allergens: [2]},
  {id: 6, name: 'Almonds', allergens: [2]},
  {id: 7, name: 'Wheat Flour', allergens: [3]},
  {id: 8, name: 'Eggs', allergens: [4]},
  {id: 9, name: 'Prawns', allergens: [5]},
  {id: 10, name: 'Fish', allergens: [7]},
  {id: 11, name: 'Chicken', allergens: []},
  {id: 12, name: 'Tomato', allergens: []},
  {id: 13, name: 'Onion', allergens: []},
  {id: 14, name: 'Garlic', allergens: []},
  {id: 15, name: 'Rice', allergens: []},
  {id: 16, name: 'Soy Sauce', allergens: [6]},
  {id: 17, name: 'Sesame Oil', allergens: [8]},
  {id: 18, name: 'Mustard Seeds', allergens: [9]}
];

let MENU_ITEMS_DATA = [
  {id: 1, name: 'Paneer Butter Masala', price: 280, dietary_id: 1, category: 'Main Course', description: 'Rich creamy tomato curry with paneer cheese', ingredients: [1,2,3,12,13,14], prepTime: 25},
  {id: 2, name: 'Dal Makhani', price: 220, dietary_id: 1, category: 'Main Course', description: 'Creamy black lentils cooked with butter and cream', ingredients: [2,3,4,13,14], prepTime: 30},
  {id: 3, name: 'Chicken Tikka Masala', price: 320, dietary_id: 2, category: 'Main Course', description: 'Grilled chicken in spiced tomato cream sauce', ingredients: [11,3,12,13,14], prepTime: 30},
  {id: 4, name: 'Butter Chicken', price: 340, dietary_id: 2, category: 'Main Course', description: 'Tender chicken in rich buttery tomato gravy', ingredients: [11,2,3,12,5], prepTime: 35},
  {id: 5, name: 'Prawn Curry', price: 420, dietary_id: 2, category: 'Main Course', description: 'Coastal style prawns in coconut curry', ingredients: [9,12,13,14], prepTime: 25},
  {id: 6, name: 'Vegetable Biryani', price: 240, dietary_id: 1, category: 'Main Course', description: 'Fragrant rice with mixed vegetables and spices', ingredients: [15,12,13,14], prepTime: 35},
  {id: 7, name: 'Veg Spring Rolls', price: 180, dietary_id: 3, category: 'Starter', description: 'Crispy rolls with vegetable filling', ingredients: [12,13,14], prepTime: 15},
  {id: 8, name: 'Mushroom Manchurian', price: 200, dietary_id: 3, category: 'Starter', description: 'Indo-Chinese style fried mushrooms', ingredients: [16,17], prepTime: 20},
  {id: 9, name: 'Fish Fry', price: 280, dietary_id: 2, category: 'Starter', description: 'Crispy fried fish with spices', ingredients: [10,14,13], prepTime: 18},
  {id: 10, name: 'Paneer Tikka', price: 260, dietary_id: 1, category: 'Starter', description: 'Marinated and grilled cottage cheese cubes', ingredients: [1,5,14,13], prepTime: 20},
  {id: 11, name: 'Gulab Jamun', price: 80, dietary_id: 1, category: 'Dessert', description: 'Sweet milk dumplings in sugar syrup', ingredients: [4,8], prepTime: 5},
  {id: 12, name: 'Mango Lassi', price: 90, dietary_id: 1, category: 'Beverage', description: 'Sweet yogurt-based mango drink', ingredients: [4], prepTime: 5}
];

let CUSTOMERS_DATA = [
  {id: 1, name: 'Arun Verma', email: 'arun@email.com', phone: '9123456780', password: 'pass123', allergies: [1], dietary: 3},
  {id: 2, name: 'Sneha Gupta', email: 'sneha@email.com', phone: '9123456781', password: 'pass123', allergies: [2], dietary: 1},
  {id: 3, name: 'Vikram Reddy', email: 'vikram@email.com', phone: '9123456782', password: 'pass123', allergies: [5], dietary: 2},
  {id: 4, name: 'Meera Iyer', email: 'meera@email.com', phone: '9123456783', password: 'pass123', allergies: [3], dietary: 1}
];

let STAFF_DATA = [
  {id: 1, name: 'Rajesh Kumar', role: 'Manager', email: 'rajesh@rest.com', phone: '9876543210', password: 'admin123', active: true},
  {id: 2, name: 'Priya Sharma', role: 'Waiter', email: 'priya@rest.com', phone: '9876543211', password: 'pass123', active: true},
  {id: 3, name: 'Amit Singh', role: 'Chef', email: 'amit@rest.com', phone: '9876543212', password: 'pass123', active: true},
  {id: 4, name: 'Neha Patel', role: 'Waiter', email: 'neha@rest.com', phone: '9876543213', password: 'pass123', active: true}
];

const ADMIN_DATA = [
  {id: 1, username: 'admin', password: 'admin123', name: 'Admin User'}
];

const TABLES_DATA = [
  {id: 1, number: 'T01', capacity: 2, location: 'Window', active: true},
  {id: 2, number: 'T02', capacity: 2, location: 'Window', active: true},
  {id: 3, number: 'T03', capacity: 4, location: 'Indoor', active: true},
  {id: 4, number: 'T04', capacity: 4, location: 'Indoor', active: true},
  {id: 5, number: 'T05', capacity: 6, location: 'Garden', active: true},
  {id: 6, number: 'T06', capacity: 6, location: 'Indoor', active: true},
  {id: 7, number: 'T07', capacity: 8, location: 'VIP', active: true},
  {id: 8, number: 'T08', capacity: 4, location: 'Garden', active: true}
];

let RESERVATIONS_DATA = [];
let ORDERS_DATA = [];

// SESSION STORAGE
let currentUser = null;
let currentCart = [];
let currentReservation = null;

// UTILITY FUNCTIONS
function showToast(message, type = 'success') {
  const toast = document.getElementById('toast');
  toast.textContent = message;
  toast.className = `toast ${type} show`;
  setTimeout(() => {
    toast.classList.remove('show');
  }, 3000);
}

function showPage(pageId) {
  document.querySelectorAll('.page').forEach(page => page.classList.remove('active'));
  document.getElementById(pageId).classList.add('active');
}

function showModal(modalId) {
  document.getElementById(modalId).classList.add('active');
}

function closeModal(modalId) {
  document.getElementById(modalId).classList.remove('active');
}

function showLoginForm(type) {
  if (type === 'customer') {
    showModal('customer-login-form');
  } else if (type === 'staff') {
    showModal('staff-login-form');
  } else if (type === 'admin') {
    showModal('admin-login-form');
  }
}

// LOGIN FUNCTIONS
function customerLogin(event) {
  event.preventDefault();
  const email = document.getElementById('customer-email').value;
  const password = document.getElementById('customer-password').value;
  
  const customer = CUSTOMERS_DATA.find(c => c.email === email && c.password === password);
  if (customer) {
    currentUser = { ...customer, role: 'customer' };
    closeModal('customer-login-form');
    showPage('customer-dashboard');
    document.getElementById('customer-name-display').textContent = `Welcome, ${customer.name}`;
    renderCustomerDashboard();
    showToast('Login successful!');
  } else {
    showToast('Invalid credentials', 'error');
  }
}

function staffLogin(event) {
  event.preventDefault();
  const email = document.getElementById('staff-email').value;
  const password = document.getElementById('staff-password').value;
  
  const staff = STAFF_DATA.find(s => s.email === email && s.password === password && s.active);
  if (staff) {
    currentUser = { ...staff, role: 'staff' };
    closeModal('staff-login-form');
    showPage('staff-dashboard');
    document.getElementById('staff-name-display').textContent = `${staff.name} (${staff.role})`;
    renderStaffDashboard();
    showToast('Login successful!');
  } else {
    showToast('Invalid credentials', 'error');
  }
}

function adminLogin(event) {
  event.preventDefault();
  const username = document.getElementById('admin-username').value;
  const password = document.getElementById('admin-password').value;
  
  const admin = ADMIN_DATA.find(a => a.username === username && a.password === password);
  if (admin) {
    currentUser = { ...admin, role: 'admin' };
    closeModal('admin-login-form');
    showPage('admin-dashboard');
    document.getElementById('admin-name-display').textContent = admin.name;
    showAdminTab('menu');
    showToast('Login successful!');
  } else {
    showToast('Invalid credentials', 'error');
  }
}

function logout() {
  currentUser = null;
  currentCart = [];
  currentReservation = null;
  showPage('login-page');
  showToast('Logged out successfully');
}

// CUSTOMER FUNCTIONS
function renderCustomerDashboard() {
  const content = document.getElementById('customer-content');
  
  if (!currentUser.allergies || currentUser.allergies.length === 0 || !currentUser.dietary) {
    content.innerHTML = `
      <div class="card text-center">
        <h2>Welcome, ${currentUser.name}!</h2>
        <p style="margin: 16px 0; color: var(--color-text-secondary);">Please set your dietary preferences to view our personalized menu.</p>
        <button class="btn btn--primary" onclick="openPreferences()">Set Preferences</button>
      </div>
    `;
  } else {
    renderMenu();
  }
}

function openPreferences() {
  const allergenContainer = document.getElementById('allergen-checkboxes');
  allergenContainer.innerHTML = ALLERGENS_DATA.map(allergen => `
    <div class="checkbox-item">
      <input type="checkbox" id="allergen-${allergen.id}" value="${allergen.id}" ${currentUser.allergies && currentUser.allergies.includes(allergen.id) ? 'checked' : ''}>
      <label for="allergen-${allergen.id}">${allergen.name}</label>
    </div>
  `).join('');
  
  const dietaryContainer = document.getElementById('dietary-radios');
  dietaryContainer.innerHTML = DIETARY_TYPES.map(diet => `
    <div class="radio-item">
      <input type="radio" id="dietary-${diet.id}" name="dietary" value="${diet.id}" ${currentUser.dietary === diet.id ? 'checked' : ''}>
      <label for="dietary-${diet.id}">${diet.name}</label>
    </div>
  `).join('');
  
  showModal('preference-modal');
}

function savePreferences(event) {
  event.preventDefault();
  
  const selectedAllergens = [];
  ALLERGENS_DATA.forEach(allergen => {
    const checkbox = document.getElementById(`allergen-${allergen.id}`);
    if (checkbox && checkbox.checked) {
      selectedAllergens.push(allergen.id);
    }
  });
  
  const dietaryRadio = document.querySelector('input[name="dietary"]:checked');
  const selectedDietary = dietaryRadio ? parseInt(dietaryRadio.value) : null;
  
  if (!selectedDietary) {
    showToast('Please select a dietary preference', 'error');
    return;
  }
  
  currentUser.allergies = selectedAllergens;
  currentUser.dietary = selectedDietary;
  
  // Update in database
  const customerIndex = CUSTOMERS_DATA.findIndex(c => c.id === currentUser.id);
  if (customerIndex !== -1) {
    CUSTOMERS_DATA[customerIndex].allergies = selectedAllergens;
    CUSTOMERS_DATA[customerIndex].dietary = selectedDietary;
  }
  
  closeModal('preference-modal');
  showToast('Preferences saved!');
  renderCustomerDashboard();
}

function getFilteredMenu() {
  // Filter by dietary preference
  let filteredItems = MENU_ITEMS_DATA.filter(item => {
    if (currentUser.dietary === 1) { // Vegetarian
      return item.dietary_id === 1 || item.dietary_id === 3 || item.dietary_id === 4;
    } else if (currentUser.dietary === 3) { // Vegan
      return item.dietary_id === 3;
    } else if (currentUser.dietary === 4) { // Jain
      return item.dietary_id === 4 || item.dietary_id === 1;
    } else if (currentUser.dietary === 5) { // Eggetarian
      return item.dietary_id === 1 || item.dietary_id === 5;
    } else if (currentUser.dietary === 6) { // Pescatarian
      return item.dietary_id === 1 || item.dietary_id === 6 || item.dietary_id === 3;
    }
    return true; // Non-veg can see all
  });
  
  // Check allergens
  filteredItems = filteredItems.map(item => {
    const unsafeAllergens = [];
    item.ingredients.forEach(ingId => {
      const ingredient = INGREDIENTS_DATA.find(i => i.id === ingId);
      if (ingredient && ingredient.allergens) {
        ingredient.allergens.forEach(allergenId => {
          if (currentUser.allergies.includes(allergenId) && !unsafeAllergens.includes(allergenId)) {
            unsafeAllergens.push(allergenId);
          }
        });
      }
    });
    
    return {
      ...item,
      unsafeAllergens
    };
  });
  
  return filteredItems;
}

function renderMenu() {
  const content = document.getElementById('customer-content');
  const filteredMenu = getFilteredMenu();
  
  const menuByCategory = {
    'Starter': [],
    'Main Course': [],
    'Dessert': [],
    'Beverage': []
  };
  
  filteredMenu.forEach(item => {
    if (menuByCategory[item.category]) {
      menuByCategory[item.category].push(item);
    }
  });
  
  let html = `
    <div class="flex-between mb-16">
      <h2>Our Menu</h2>
      <div class="flex gap-8">
        <button class="btn btn--secondary" onclick="openPreferences()">Change Preferences</button>
        <button class="btn btn--primary" onclick="viewCart()">View Cart (${currentCart.length})</button>
        <button class="btn btn--secondary btn--sm" onclick="viewOrderHistory()">Order History</button>
      </div>
    </div>
  `;
  
  Object.keys(menuByCategory).forEach(category => {
    if (menuByCategory[category].length > 0) {
      html += `<h3 style="margin-top: 24px; margin-bottom: 16px;">${category}</h3>`;
      html += '<div class="menu-grid">';
      
      menuByCategory[category].forEach(item => {
        const hasAllergen = item.unsafeAllergens && item.unsafeAllergens.length > 0;
        const dietaryType = DIETARY_TYPES.find(d => d.id === item.dietary_id);
        
        html += `
          <div class="menu-item ${hasAllergen ? 'has-allergen' : ''}" onclick="viewItemDetails(${item.id})">
            <div class="menu-item-header">
              <div>
                <h3>${item.name}</h3>
                <div class="menu-item-meta">
                  <span class="badge">${item.category}</span>
                  <span class="badge">${dietaryType ? dietaryType.name : ''}</span>
                </div>
              </div>
              <span class="menu-item-price">₹${item.price}</span>
            </div>
            ${hasAllergen ? `<div class="badge badge--warning" style="margin-bottom: 8px;">⚠️ Contains: ${item.unsafeAllergens.map(id => ALLERGENS_DATA.find(a => a.id === id).name).join(', ')}</div>` : ''}
            <p class="menu-item-description">${item.description}</p>
            <div class="menu-item-actions" onclick="event.stopPropagation()">
              <div class="quantity-selector">
                <button class="quantity-btn" onclick="changeQuantity(${item.id}, -1)">-</button>
                <span class="quantity-display" id="qty-${item.id}">${getItemQuantityInCart(item.id)}</span>
                <button class="quantity-btn" onclick="changeQuantity(${item.id}, 1)">+</button>
              </div>
              <button class="btn btn--primary btn--sm" onclick="addToCart(${item.id})">Add to Cart</button>
            </div>
          </div>
        `;
      });
      
      html += '</div>';
    }
  });
  
  content.innerHTML = html;
}

function getItemQuantityInCart(itemId) {
  const cartItem = currentCart.find(item => item.id === itemId);
  return cartItem ? cartItem.quantity : 0;
}

function changeQuantity(itemId, delta) {
  const qtyElement = document.getElementById(`qty-${itemId}`);
  let currentQty = parseInt(qtyElement.textContent) || 0;
  currentQty = Math.max(0, currentQty + delta);
  qtyElement.textContent = currentQty;
}

function addToCart(itemId) {
  const qtyElement = document.getElementById(`qty-${itemId}`);
  const quantity = parseInt(qtyElement.textContent) || 0;
  
  if (quantity === 0) {
    showToast('Please select quantity', 'error');
    return;
  }
  
  const item = MENU_ITEMS_DATA.find(i => i.id === itemId);
  if (!item) return;
  
  const existingItem = currentCart.find(i => i.id === itemId);
  if (existingItem) {
    existingItem.quantity = quantity;
  } else {
    currentCart.push({ ...item, quantity });
  }
  
  showToast(`Added ${item.name} to cart`);
  renderMenu();
}

function viewItemDetails(itemId) {
  const item = MENU_ITEMS_DATA.find(i => i.id === itemId);
  if (!item) return;
  
  const dietaryType = DIETARY_TYPES.find(d => d.id === item.dietary_id);
  const ingredients = item.ingredients.map(ingId => {
    const ing = INGREDIENTS_DATA.find(i => i.id === ingId);
    return ing ? ing.name : '';
  }).filter(n => n);
  
  const allergens = [];
  item.ingredients.forEach(ingId => {
    const ingredient = INGREDIENTS_DATA.find(i => i.id === ingId);
    if (ingredient && ingredient.allergens) {
      ingredient.allergens.forEach(allergenId => {
        const allergen = ALLERGENS_DATA.find(a => a.id === allergenId);
        if (allergen && !allergens.find(a => a.id === allergenId)) {
          allergens.push(allergen);
        }
      });
    }
  });
  
  const hasUserAllergen = allergens.some(a => currentUser.allergies.includes(a.id));
  
  const html = `
    <h2>${item.name}</h2>
    <p style="margin: 12px 0; font-size: 24px; font-weight: bold; color: var(--color-primary);">₹${item.price}</p>
    <div style="margin-bottom: 16px;">
      <span class="badge">${item.category}</span>
      <span class="badge">${dietaryType ? dietaryType.name : ''}</span>
    </div>
    <p style="margin-bottom: 16px;">${item.description}</p>
    <div style="margin-bottom: 16px;">
      <h4 style="margin-bottom: 8px;">Ingredients:</h4>
      <p style="color: var(--color-text-secondary);">${ingredients.join(', ')}</p>
    </div>
    ${allergens.length > 0 ? `
      <div style="margin-bottom: 16px;">
        <h4 style="margin-bottom: 8px;">Allergens Present:</h4>
        <div style="display: flex; gap: 8px; flex-wrap: wrap;">
          ${allergens.map(a => `<span class="badge ${currentUser.allergies.includes(a.id) ? 'badge--danger' : ''}">${a.name}</span>`).join('')}
        </div>
      </div>
    ` : ''}
    ${hasUserAllergen ? `
      <div class="badge badge--danger" style="display: block; padding: 12px; margin-top: 16px;">
        ⚠️ Warning: This item contains allergens you are sensitive to!
      </div>
    ` : ''}
    <p style="margin-top: 16px; color: var(--color-text-secondary); font-size: 12px;">Preparation time: ${item.prepTime} minutes</p>
  `;
  
  document.getElementById('item-details-content').innerHTML = html;
  showModal('item-details-modal');
}

function viewCart() {
  if (currentCart.length === 0) {
    showToast('Cart is empty', 'error');
    return;
  }
  
  const content = document.getElementById('customer-content');
  
  let subtotal = 0;
  let html = `
    <div class="flex-between mb-16">
      <h2>Your Cart</h2>
      <button class="btn btn--secondary" onclick="renderMenu()">Back to Menu</button>
    </div>
    <div class="cart-container">
  `;
  
  currentCart.forEach((item, index) => {
    const total = item.price * item.quantity;
    subtotal += total;
    html += `
      <div class="cart-item">
        <div>
          <h4>${item.name}</h4>
          <p style="color: var(--color-text-secondary); font-size: 12px;">₹${item.price} × ${item.quantity}</p>
        </div>
        <div style="display: flex; align-items: center; gap: 16px;">
          <span style="font-weight: bold;">₹${total}</span>
          <button class="btn btn--danger btn--sm" onclick="removeFromCart(${index})">Remove</button>
        </div>
      </div>
    `;
  });
  
  const tax = subtotal * 0.05;
  const total = subtotal + tax;
  
  html += `
      <div class="cart-summary">
        <div class="cart-summary-row">
          <span>Subtotal:</span>
          <span>₹${subtotal.toFixed(2)}</span>
        </div>
        <div class="cart-summary-row">
          <span>Tax (5%):</span>
          <span>₹${tax.toFixed(2)}</span>
        </div>
        <div class="cart-summary-row total">
          <span>Total:</span>
          <span>₹${total.toFixed(2)}</span>
        </div>
        <button class="btn btn--primary btn--full-width mt-16" onclick="proceedToReservation()">Proceed to Reservation</button>
      </div>
    </div>
  `;
  
  content.innerHTML = html;
}

function removeFromCart(index) {
  currentCart.splice(index, 1);
  viewCart();
  showToast('Item removed from cart');
}

function proceedToReservation() {
  // Set minimum date to today
  const today = new Date().toISOString().split('T')[0];
  document.getElementById('reservation-date').setAttribute('min', today);
  showModal('reservation-modal');
}

function bookReservation(event) {
  event.preventDefault();
  
  const date = document.getElementById('reservation-date').value;
  const time = document.getElementById('reservation-time').value;
  const guests = parseInt(document.getElementById('reservation-guests').value);
  const location = document.getElementById('reservation-location').value;
  const notes = document.getElementById('reservation-notes').value;
  
  // Find available table
  const availableTables = TABLES_DATA.filter(table => {
    if (!table.active || table.capacity < guests) return false;
    if (location && table.location !== location) return false;
    
    // Check if table is already reserved
    const isReserved = RESERVATIONS_DATA.some(r => 
      r.table_id === table.id && r.date === date && r.time === time && r.status === 'confirmed'
    );
    return !isReserved;
  });
  
  if (availableTables.length === 0) {
    showToast('No tables available for selected preferences', 'error');
    return;
  }
  
  const selectedTable = availableTables[0];
  const reservationId = `RES${Date.now()}`;
  
  const reservation = {
    id: reservationId,
    customer_id: currentUser.id,
    customer_name: currentUser.name,
    table_id: selectedTable.id,
    table_number: selectedTable.number,
    date,
    time,
    guests,
    notes,
    status: 'confirmed'
  };
  
  RESERVATIONS_DATA.push(reservation);
  currentReservation = reservation;
  
  closeModal('reservation-modal');
  showConfirmation();
}

function showConfirmation() {
  const content = document.getElementById('customer-content');
  
  const subtotal = currentCart.reduce((sum, item) => sum + (item.price * item.quantity), 0);
  const tax = subtotal * 0.05;
  const total = subtotal + tax;
  
  let html = `
    <div class="confirmation">
      <h2>✅ Reservation Confirmed!</h2>
      <p><strong>Reservation ID:</strong> ${currentReservation.id}</p>
      <p><strong>Date:</strong> ${currentReservation.date}</p>
      <p><strong>Time:</strong> ${currentReservation.time}</p>
      <p><strong>Table Number:</strong> ${currentReservation.table_number}</p>
      <p><strong>Party Size:</strong> ${currentReservation.guests} guests</p>
      ${currentReservation.notes ? `<p><strong>Special Requests:</strong> ${currentReservation.notes}</p>` : ''}
    </div>
    
    <div class="card mt-24">
      <h3 style="margin-bottom: 16px;">Order Summary</h3>
  `;
  
  currentCart.forEach(item => {
    html += `
      <div class="flex-between" style="padding: 8px 0; border-bottom: 1px solid var(--color-border);">
        <span>${item.name} × ${item.quantity}</span>
        <span>₹${(item.price * item.quantity).toFixed(2)}</span>
      </div>
    `;
  });
  
  html += `
      <div class="flex-between" style="padding: 8px 0; margin-top: 12px;">
        <span>Subtotal:</span>
        <span>₹${subtotal.toFixed(2)}</span>
      </div>
      <div class="flex-between" style="padding: 8px 0;">
        <span>Tax (5%):</span>
        <span>₹${tax.toFixed(2)}</span>
      </div>
      <div class="flex-between" style="padding: 8px 0; margin-top: 12px; border-top: 2px solid var(--color-border); font-weight: bold; font-size: 18px;">
        <span>Total:</span>
        <span>₹${total.toFixed(2)}</span>
      </div>
      <button class="btn btn--primary btn--full-width mt-16" onclick="completeOrder()">Complete Order</button>
    </div>
  `;
  
  content.innerHTML = html;
}

function completeOrder() {
  const orderId = `ORD${Date.now()}`;
  const subtotal = currentCart.reduce((sum, item) => sum + (item.price * item.quantity), 0);
  const tax = subtotal * 0.05;
  const total = subtotal + tax;
  
  const order = {
    id: orderId,
    customer_id: currentUser.id,
    customer_name: currentUser.name,
    reservation_id: currentReservation.id,
    table_number: currentReservation.table_number,
    items: [...currentCart],
    subtotal,
    tax,
    total,
    status: 'pending',
    date: new Date().toISOString().split('T')[0],
    time: new Date().toLocaleTimeString()
  };
  
  ORDERS_DATA.push(order);
  
  showToast('Order placed successfully!');
  currentCart = [];
  currentReservation = null;
  renderCustomerDashboard();
}

function viewOrderHistory() {
  const content = document.getElementById('customer-content');
  const customerOrders = ORDERS_DATA.filter(o => o.customer_id === currentUser.id);
  
  let html = `
    <div class="flex-between mb-16">
      <h2>Order History</h2>
      <button class="btn btn--secondary" onclick="renderMenu()">Back to Menu</button>
    </div>
  `;
  
  if (customerOrders.length === 0) {
    html += '<p class="text-center text-secondary">No orders yet</p>';
  } else {
    html += '<table class="data-table">';
    html += '<thead><tr><th>Order ID</th><th>Date</th><th>Items</th><th>Total</th><th>Status</th><th>Action</th></tr></thead><tbody>';
    
    customerOrders.reverse().forEach(order => {
      html += `
        <tr>
          <td>${order.id}</td>
          <td>${order.date}</td>
          <td>${order.items.length} items</td>
          <td>₹${order.total.toFixed(2)}</td>
          <td><span class="status-badge ${order.status}">${order.status}</span></td>
          <td><button class="btn btn--secondary btn--sm" onclick="viewOrderDetails('${order.id}')">View</button></td>
        </tr>
      `;
    });
    
    html += '</tbody></table>';
  }
  
  content.innerHTML = html;
}

function viewOrderDetails(orderId) {
  const order = ORDERS_DATA.find(o => o.id === orderId);
  if (!order) return;
  
  let html = `
    <h2>Order Details</h2>
    <p style="margin: 12px 0;"><strong>Order ID:</strong> ${order.id}</p>
    <p style="margin: 12px 0;"><strong>Date:</strong> ${order.date} at ${order.time}</p>
    <p style="margin: 12px 0;"><strong>Table:</strong> ${order.table_number}</p>
    <p style="margin: 12px 0;"><strong>Status:</strong> <span class="status-badge ${order.status}">${order.status}</span></p>
    <h4 style="margin-top: 20px; margin-bottom: 12px;">Items:</h4>
  `;
  
  order.items.forEach(item => {
    html += `
      <div style="display: flex; justify-content: space-between; padding: 8px 0; border-bottom: 1px solid var(--color-border);">
        <span>${item.name} × ${item.quantity}</span>
        <span>₹${(item.price * item.quantity).toFixed(2)}</span>
      </div>
    `;
  });
  
  html += `
    <div style="margin-top: 16px; padding-top: 16px; border-top: 2px solid var(--color-border);">
      <div style="display: flex; justify-content: space-between; margin-bottom: 8px;">
        <span>Subtotal:</span>
        <span>₹${order.subtotal.toFixed(2)}</span>
      </div>
      <div style="display: flex; justify-content: space-between; margin-bottom: 8px;">
        <span>Tax (5%):</span>
        <span>₹${order.tax.toFixed(2)}</span>
      </div>
      <div style="display: flex; justify-content: space-between; font-weight: bold; font-size: 18px; margin-top: 12px;">
        <span>Total:</span>
        <span>₹${order.total.toFixed(2)}</span>
      </div>
    </div>
  `;
  
  document.getElementById('item-details-content').innerHTML = html;
  showModal('item-details-modal');
}

// STAFF FUNCTIONS
function renderStaffDashboard() {
  const content = document.getElementById('staff-content');
  
  if (currentUser.role === 'Manager' || currentUser.role === 'staff') {
    if (currentUser.role === 'Manager') {
      renderManagerView();
    } else if (currentUser.role === 'Waiter') {
      renderWaiterView();
    } else if (currentUser.role === 'Chef') {
      renderChefView();
    } else {
      // Default to showing all views for generic staff
      renderManagerView();
    }
  }
}

function renderWaiterView() {
  const content = document.getElementById('staff-content');
  const today = new Date().toISOString().split('T')[0];
  const todayReservations = RESERVATIONS_DATA.filter(r => r.date === today && r.status === 'confirmed');
  const activeOrders = ORDERS_DATA.filter(o => o.status === 'pending' || o.status === 'preparing' || o.status === 'ready');
  
  let html = `
    <h2>Waiter Dashboard</h2>
    <div class="stats-grid">
      <div class="stat-card">
        <h3>Today's Reservations</h3>
        <div class="stat-value">${todayReservations.length}</div>
      </div>
      <div class="stat-card">
        <h3>Active Orders</h3>
        <div class="stat-value">${activeOrders.length}</div>
      </div>
    </div>
    
    <h3 style="margin-top: 32px; margin-bottom: 16px;">Active Orders</h3>
  `;
  
  if (activeOrders.length === 0) {
    html += '<p class="text-secondary">No active orders</p>';
  } else {
    html += '<table class="data-table"><thead><tr><th>Order ID</th><th>Customer</th><th>Table</th><th>Items</th><th>Status</th><th>Action</th></tr></thead><tbody>';
    activeOrders.forEach(order => {
      html += `
        <tr>
          <td>${order.id}</td>
          <td>${order.customer_name}</td>
          <td>${order.table_number}</td>
          <td>${order.items.length} items</td>
          <td><span class="status-badge ${order.status}">${order.status}</span></td>
          <td>
            ${order.status === 'ready' ? `<button class="btn btn--primary btn--sm" onclick="markOrderServed('${order.id}')">Mark Served</button>` : ''}
            <button class="btn btn--secondary btn--sm" onclick="viewOrderDetails('${order.id}')">View</button>
          </td>
        </tr>
      `;
    });
    html += '</tbody></table>';
  }
  
  html += `
    <h3 style="margin-top: 32px; margin-bottom: 16px;">Today's Reservations</h3>
  `;
  
  if (todayReservations.length === 0) {
    html += '<p class="text-secondary">No reservations for today</p>';
  } else {
    html += '<table class="data-table"><thead><tr><th>ID</th><th>Customer</th><th>Table</th><th>Time</th><th>Guests</th><th>Notes</th></tr></thead><tbody>';
    todayReservations.forEach(res => {
      html += `
        <tr>
          <td>${res.id}</td>
          <td>${res.customer_name}</td>
          <td>${res.table_number}</td>
          <td>${res.time}</td>
          <td>${res.guests}</td>
          <td>${res.notes || '-'}</td>
        </tr>
      `;
    });
    html += '</tbody></table>';
  }
  
  content.innerHTML = html;
}

function markOrderServed(orderId) {
  const order = ORDERS_DATA.find(o => o.id === orderId);
  if (order) {
    order.status = 'served';
    showToast('Order marked as served');
    renderWaiterView();
  }
}

function renderChefView() {
  const content = document.getElementById('staff-content');
  const kitchenOrders = ORDERS_DATA.filter(o => o.status === 'pending' || o.status === 'preparing');
  
  let html = `
    <h2>Kitchen Display</h2>
    <div class="stats-grid">
      <div class="stat-card">
        <h3>Pending Orders</h3>
        <div class="stat-value">${ORDERS_DATA.filter(o => o.status === 'pending').length}</div>
      </div>
      <div class="stat-card">
        <h3>Preparing</h3>
        <div class="stat-value">${ORDERS_DATA.filter(o => o.status === 'preparing').length}</div>
      </div>
    </div>
    
    <h3 style="margin-top: 32px; margin-bottom: 16px;">Kitchen Orders</h3>
  `;
  
  if (kitchenOrders.length === 0) {
    html += '<p class="text-secondary">No orders in kitchen</p>';
  } else {
    kitchenOrders.forEach(order => {
      html += `
        <div class="card" style="margin-bottom: 16px;">
          <div class="flex-between" style="margin-bottom: 12px;">
            <div>
              <h4>${order.id} - Table ${order.table_number}</h4>
              <p style="color: var(--color-text-secondary); font-size: 12px;">${order.customer_name}</p>
            </div>
            <span class="status-badge ${order.status}">${order.status}</span>
          </div>
          <div style="margin-bottom: 12px;">
            ${order.items.map(item => `<p>• ${item.name} × ${item.quantity}</p>`).join('')}
          </div>
          <div class="flex gap-8">
            ${order.status === 'pending' ? `<button class="btn btn--primary btn--sm" onclick="markOrderPreparing('${order.id}')">Start Preparing</button>` : ''}
            ${order.status === 'preparing' ? `<button class="btn btn--primary btn--sm" onclick="markOrderReady('${order.id}')">Mark Ready</button>` : ''}
          </div>
        </div>
      `;
    });
  }
  
  content.innerHTML = html;
}

function markOrderPreparing(orderId) {
  const order = ORDERS_DATA.find(o => o.id === orderId);
  if (order) {
    order.status = 'preparing';
    showToast('Order status updated to preparing');
    renderChefView();
  }
}

function markOrderReady(orderId) {
  const order = ORDERS_DATA.find(o => o.id === orderId);
  if (order) {
    order.status = 'ready';
    showToast('Order marked as ready');
    renderChefView();
  }
}

function renderManagerView() {
  const content = document.getElementById('staff-content');
  const today = new Date().toISOString().split('T')[0];
  const todayOrders = ORDERS_DATA.filter(o => o.date === today);
  const todayRevenue = todayOrders.reduce((sum, o) => sum + o.total, 0);
  const todayReservations = RESERVATIONS_DATA.filter(r => r.date === today);
  
  let html = `
    <h2>Manager Dashboard</h2>
    <div class="stats-grid">
      <div class="stat-card">
        <h3>Today's Orders</h3>
        <div class="stat-value">${todayOrders.length}</div>
      </div>
      <div class="stat-card">
        <h3>Today's Revenue</h3>
        <div class="stat-value">₹${todayRevenue.toFixed(0)}</div>
      </div>
      <div class="stat-card">
        <h3>Reservations</h3>
        <div class="stat-value">${todayReservations.length}</div>
      </div>
      <div class="stat-card">
        <h3>Active Tables</h3>
        <div class="stat-value">${TABLES_DATA.filter(t => t.active).length}</div>
      </div>
    </div>
    
    <h3 style="margin-top: 32px; margin-bottom: 16px;">Recent Orders</h3>
  `;
  
  if (ORDERS_DATA.length === 0) {
    html += '<p class="text-secondary">No orders yet</p>';
  } else {
    const recentOrders = [...ORDERS_DATA].reverse().slice(0, 10);
    html += '<table class="data-table"><thead><tr><th>Order ID</th><th>Customer</th><th>Table</th><th>Total</th><th>Status</th><th>Action</th></tr></thead><tbody>';
    recentOrders.forEach(order => {
      html += `
        <tr>
          <td>${order.id}</td>
          <td>${order.customer_name}</td>
          <td>${order.table_number}</td>
          <td>₹${order.total.toFixed(2)}</td>
          <td><span class="status-badge ${order.status}">${order.status}</span></td>
          <td>
            ${order.status === 'served' ? `<button class="btn btn--primary btn--sm" onclick="markOrderCompleted('${order.id}')">Complete</button>` : ''}
            <button class="btn btn--secondary btn--sm" onclick="viewOrderDetails('${order.id}')">View</button>
          </td>
        </tr>
      `;
    });
    html += '</tbody></table>';
  }
  
  content.innerHTML = html;
}

function markOrderCompleted(orderId) {
  const order = ORDERS_DATA.find(o => o.id === orderId);
  if (order) {
    order.status = 'completed';
    showToast('Order completed');
    renderManagerView();
  }
}

// ADMIN FUNCTIONS
function showAdminTab(tab) {
  document.querySelectorAll('.tab-btn').forEach(btn => btn.classList.remove('active'));
  event.target.classList.add('active');
  
  if (tab === 'menu') {
    renderMenuManagement();
  } else if (tab === 'staff') {
    renderStaffManagement();
  } else if (tab === 'analytics') {
    renderAnalytics();
  }
}

function renderMenuManagement() {
  const content = document.getElementById('admin-content');
  
  let html = `
    <div class="flex-between mb-16">
      <h2>Menu Management</h2>
      <button class="btn btn--primary" onclick="addMenuItem()">Add New Item</button>
    </div>
    <table class="data-table">
      <thead>
        <tr>
          <th>Name</th>
          <th>Category</th>
          <th>Price</th>
          <th>Dietary</th>
          <th>Actions</th>
        </tr>
      </thead>
      <tbody>
  `;
  
  MENU_ITEMS_DATA.forEach(item => {
    const dietary = DIETARY_TYPES.find(d => d.id === item.dietary_id);
    html += `
      <tr>
        <td>${item.name}</td>
        <td>${item.category}</td>
        <td>₹${item.price}</td>
        <td>${dietary ? dietary.name : ''}</td>
        <td>
          <button class="btn btn--secondary btn--sm" onclick="editMenuItem(${item.id})">Edit</button>
          <button class="btn btn--danger btn--sm" onclick="deleteMenuItem(${item.id})">Delete</button>
        </td>
      </tr>
    `;
  });
  
  html += '</tbody></table>';
  content.innerHTML = html;
}

function addMenuItem() {
  document.getElementById('menu-item-modal-title').textContent = 'Add Menu Item';
  document.getElementById('edit-item-id').value = '';
  document.getElementById('item-name').value = '';
  document.getElementById('item-description').value = '';
  document.getElementById('item-price').value = '';
  document.getElementById('item-category').value = 'Starter';
  document.getElementById('item-preptime').value = '';
  
  // Populate dietary dropdown
  const dietarySelect = document.getElementById('item-dietary');
  dietarySelect.innerHTML = DIETARY_TYPES.map(d => `<option value="${d.id}">${d.name}</option>`).join('');
  
  // Populate ingredients checkboxes
  const ingredientsContainer = document.getElementById('item-ingredients');
  ingredientsContainer.innerHTML = INGREDIENTS_DATA.map(ing => `
    <div class="checkbox-item">
      <input type="checkbox" id="ing-${ing.id}" value="${ing.id}">
      <label for="ing-${ing.id}">${ing.name}</label>
    </div>
  `).join('');
  
  showModal('menu-item-modal');
}

function editMenuItem(itemId) {
  const item = MENU_ITEMS_DATA.find(i => i.id === itemId);
  if (!item) return;
  
  document.getElementById('menu-item-modal-title').textContent = 'Edit Menu Item';
  document.getElementById('edit-item-id').value = item.id;
  document.getElementById('item-name').value = item.name;
  document.getElementById('item-description').value = item.description;
  document.getElementById('item-price').value = item.price;
  document.getElementById('item-category').value = item.category;
  document.getElementById('item-preptime').value = item.prepTime;
  
  // Populate dietary dropdown
  const dietarySelect = document.getElementById('item-dietary');
  dietarySelect.innerHTML = DIETARY_TYPES.map(d => `<option value="${d.id}" ${d.id === item.dietary_id ? 'selected' : ''}>${d.name}</option>`).join('');
  
  // Populate ingredients checkboxes
  const ingredientsContainer = document.getElementById('item-ingredients');
  ingredientsContainer.innerHTML = INGREDIENTS_DATA.map(ing => `
    <div class="checkbox-item">
      <input type="checkbox" id="ing-${ing.id}" value="${ing.id}" ${item.ingredients.includes(ing.id) ? 'checked' : ''}>
      <label for="ing-${ing.id}">${ing.name}</label>
    </div>
  `).join('');
  
  showModal('menu-item-modal');
}

function saveMenuItem(event) {
  event.preventDefault();
  
  const itemId = document.getElementById('edit-item-id').value;
  const name = document.getElementById('item-name').value;
  const description = document.getElementById('item-description').value;
  const price = parseFloat(document.getElementById('item-price').value);
  const category = document.getElementById('item-category').value;
  const dietary_id = parseInt(document.getElementById('item-dietary').value);
  const prepTime = parseInt(document.getElementById('item-preptime').value);
  
  const ingredients = [];
  INGREDIENTS_DATA.forEach(ing => {
    const checkbox = document.getElementById(`ing-${ing.id}`);
    if (checkbox && checkbox.checked) {
      ingredients.push(ing.id);
    }
  });
  
  if (itemId) {
    // Edit existing
    const index = MENU_ITEMS_DATA.findIndex(i => i.id === parseInt(itemId));
    if (index !== -1) {
      MENU_ITEMS_DATA[index] = {
        ...MENU_ITEMS_DATA[index],
        name,
        description,
        price,
        category,
        dietary_id,
        prepTime,
        ingredients
      };
      showToast('Menu item updated');
    }
  } else {
    // Add new
    const newId = Math.max(...MENU_ITEMS_DATA.map(i => i.id), 0) + 1;
    MENU_ITEMS_DATA.push({
      id: newId,
      name,
      description,
      price,
      category,
      dietary_id,
      prepTime,
      ingredients
    });
    showToast('Menu item added');
  }
  
  closeModal('menu-item-modal');
  renderMenuManagement();
}

function deleteMenuItem(itemId) {
  if (confirm('Are you sure you want to delete this item?')) {
    MENU_ITEMS_DATA = MENU_ITEMS_DATA.filter(i => i.id !== itemId);
    showToast('Menu item deleted');
    renderMenuManagement();
  }
}

function renderStaffManagement() {
  const content = document.getElementById('admin-content');
  
  let html = `
    <div class="flex-between mb-16">
      <h2>Staff Management</h2>
      <button class="btn btn--primary" onclick="addStaff()">Add New Staff</button>
    </div>
    <table class="data-table">
      <thead>
        <tr>
          <th>Name</th>
          <th>Role</th>
          <th>Email</th>
          <th>Phone</th>
          <th>Status</th>
          <th>Actions</th>
        </tr>
      </thead>
      <tbody>
  `;
  
  STAFF_DATA.forEach(staff => {
    html += `
      <tr>
        <td>${staff.name}</td>
        <td>${staff.role}</td>
        <td>${staff.email}</td>
        <td>${staff.phone}</td>
        <td><span class="status-badge ${staff.active ? 'ready' : 'pending'}">${staff.active ? 'Active' : 'Inactive'}</span></td>
        <td>
          <button class="btn btn--secondary btn--sm" onclick="editStaff(${staff.id})">Edit</button>
          <button class="btn btn--${staff.active ? 'danger' : 'primary'} btn--sm" onclick="toggleStaffStatus(${staff.id})">${staff.active ? 'Deactivate' : 'Activate'}</button>
        </td>
      </tr>
    `;
  });
  
  html += '</tbody></table>';
  content.innerHTML = html;
}

function addStaff() {
  document.getElementById('staff-modal-title').textContent = 'Add Staff Member';
  document.getElementById('edit-staff-id').value = '';
  document.getElementById('staff-name').value = '';
  document.getElementById('staff-role').value = 'Waiter';
  document.getElementById('staff-email-input').value = '';
  document.getElementById('staff-phone').value = '';
  showModal('staff-modal');
}

function editStaff(staffId) {
  const staff = STAFF_DATA.find(s => s.id === staffId);
  if (!staff) return;
  
  document.getElementById('staff-modal-title').textContent = 'Edit Staff Member';
  document.getElementById('edit-staff-id').value = staff.id;
  document.getElementById('staff-name').value = staff.name;
  document.getElementById('staff-role').value = staff.role;
  document.getElementById('staff-email-input').value = staff.email;
  document.getElementById('staff-phone').value = staff.phone;
  showModal('staff-modal');
}

function saveStaff(event) {
  event.preventDefault();
  
  const staffId = document.getElementById('edit-staff-id').value;
  const name = document.getElementById('staff-name').value;
  const role = document.getElementById('staff-role').value;
  const email = document.getElementById('staff-email-input').value;
  const phone = document.getElementById('staff-phone').value;
  
  if (staffId) {
    // Edit existing
    const index = STAFF_DATA.findIndex(s => s.id === parseInt(staffId));
    if (index !== -1) {
      STAFF_DATA[index] = {
        ...STAFF_DATA[index],
        name,
        role,
        email,
        phone
      };
      showToast('Staff member updated');
    }
  } else {
    // Add new
    const newId = Math.max(...STAFF_DATA.map(s => s.id), 0) + 1;
    STAFF_DATA.push({
      id: newId,
      name,
      role,
      email,
      phone,
      password: 'pass123',
      active: true
    });
    showToast('Staff member added');
  }
  
  closeModal('staff-modal');
  renderStaffManagement();
}

function toggleStaffStatus(staffId) {
  const staff = STAFF_DATA.find(s => s.id === staffId);
  if (staff) {
    staff.active = !staff.active;
    showToast(`Staff ${staff.active ? 'activated' : 'deactivated'}`);
    renderStaffManagement();
  }
}

function renderAnalytics() {
  const content = document.getElementById('admin-content');
  
  const today = new Date().toISOString().split('T')[0];
  const todayOrders = ORDERS_DATA.filter(o => o.date === today);
  const todayRevenue = todayOrders.reduce((sum, o) => sum + o.total, 0);
  const avgBill = todayOrders.length > 0 ? todayRevenue / todayOrders.length : 0;
  
  // Calculate most popular items
  const itemCounts = {};
  ORDERS_DATA.forEach(order => {
    order.items.forEach(item => {
      if (!itemCounts[item.name]) {
        itemCounts[item.name] = 0;
      }
      itemCounts[item.name] += item.quantity;
    });
  });
  
  const popularItems = Object.entries(itemCounts)
    .sort((a, b) => b[1] - a[1])
    .slice(0, 5);
  
  let html = `
    <h2>Analytics & Reports</h2>
    <div class="stats-grid">
      <div class="stat-card">
        <h3>Total Orders Today</h3>
        <div class="stat-value">${todayOrders.length}</div>
      </div>
      <div class="stat-card">
        <h3>Total Revenue Today</h3>
        <div class="stat-value">₹${todayRevenue.toFixed(0)}</div>
      </div>
      <div class="stat-card">
        <h3>Average Bill</h3>
        <div class="stat-value">₹${avgBill.toFixed(0)}</div>
      </div>
      <div class="stat-card">
        <h3>Total Reservations</h3>
        <div class="stat-value">${RESERVATIONS_DATA.length}</div>
      </div>
    </div>
    
    <h3 style="margin-top: 32px; margin-bottom: 16px;">Most Popular Items</h3>
    <div class="card">
  `;
  
  if (popularItems.length === 0) {
    html += '<p class="text-secondary">No data available</p>';
  } else {
    popularItems.forEach(([name, count], index) => {
      html += `
        <div style="display: flex; justify-content: space-between; padding: 12px 0; ${index < popularItems.length - 1 ? 'border-bottom: 1px solid var(--color-border);' : ''}">
          <span><strong>${index + 1}.</strong> ${name}</span>
          <span class="badge">${count} orders</span>
        </div>
      `;
    });
  }
  
  html += `
    </div>
    
    <h3 style="margin-top: 32px; margin-bottom: 16px;">Order Status Breakdown</h3>
    <div class="stats-grid">
  `;
  
  const statusCounts = {
    pending: ORDERS_DATA.filter(o => o.status === 'pending').length,
    preparing: ORDERS_DATA.filter(o => o.status === 'preparing').length,
    ready: ORDERS_DATA.filter(o => o.status === 'ready').length,
    served: ORDERS_DATA.filter(o => o.status === 'served').length,
    completed: ORDERS_DATA.filter(o => o.status === 'completed').length
  };
  
  Object.entries(statusCounts).forEach(([status, count]) => {
    html += `
      <div class="stat-card">
        <h3>${status.charAt(0).toUpperCase() + status.slice(1)}</h3>
        <div class="stat-value">${count}</div>
      </div>
    `;
  });
  
  html += '</div>';
  content.innerHTML = html;
}

// Initialize
document.addEventListener('DOMContentLoaded', () => {
  showPage('login-page');
});