# Subscribe CRUD Operations

This document describes CRUD operations for managing subscriptions in Java, focusing on users and activities. The implementation uses Java EE for backend development and Oracle SQL for database management.

## Features

1. 📋 **Create Subscription**: Users can subscribe to activities.
2. 📖 **Read Subscription**: Retrieve subscription details based on user or activity.
3. ✏️ **Update Subscription**: Modify subscription details.
4. 🗑️ **Delete Subscription**: Remove subscriptions.

## Table Schema

To manage subscriptions, a table named `SUBSCRIBE` is used with the following structure:

The table includes:

- `SUBSCRIBE_ID`: A unique identifier for each subscription.
- `USER_ID`: Foreign key referencing the user.
- `ACTIVITY_ID`: Foreign key referencing the activity.
- `SUBSCRIBE_DATE`: The date the subscription was created.
- `STATUS`: Indicates the current status of the subscription.

## CRUD Operations Explained

### 1. Create Subscription

This operation allows the creation of a new subscription by specifying the user ID, activity ID, and subscription status. It ensures a link between users and the activities they subscribe to.

### 2. Read Subscription

Retrieve detailed information about a specific subscription, such as the user, activity, and status, using its unique identifier.

### 3. Update Subscription

Modify the subscription status to reflect changes such as activation or deactivation of a subscription.

### 4. Delete Subscription

Remove an existing subscription permanently from the database using its unique identifier.

## Setup Instructions

1. Ensure the `USERS` and `ACTIVITIES` tables exist in your database with appropriate columns and constraints.
2. Execute the SQL query to create the `SUBSCRIBE` table.
3. Configure your Java application to connect to the Oracle database.
4. Implement the CRUD methods in your application.
5. Test the functionality using a suitable frontend or testing framework.

## Visual Overview

### Example Workflow

- **User subscribes to an activity:**
  - `CREATE` operation stores the new subscription.
  - `READ` operation retrieves all subscriptions for verification.
- **User updates the subscription status:**
  - `UPDATE` operation modifies the subscription details.
- **User unsubscribes from an activity:**
  - `DELETE` operation removes the subscription record.

---

Use this document as a guideline for understanding and implementing subscription management in your project. Let me know if further clarifications are needed!
