package com.prostrategy.ai.commonlib.utils;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.*;

public class Constants {
    public static final int DEFAULT_PAGE_SIZE = 10;

    // Base status enum that can be used across all entities
    public enum CommonStatus {
        DELETED("deleted", "Deleted"),
        ACTIVE("active", "Active"),
        IN_ACTIVE("in_active", "InActive"),
        PENDING("pending", "Pending");

        private final String key;
        private final String value;

        CommonStatus(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        @JsonCreator
        public static CommonStatus fromKey(String key) {
            for (CommonStatus status : CommonStatus.values()) {
                if (status.key.equalsIgnoreCase(key)) {
                    return status;
                }
            }
            throw new IllegalArgumentException("Invalid status: " + key);
        }
    }

    // Common interface for all key-value enums
    public interface KeyValueEnum {
        String getKey();
        String getValue();
    }

    // Subscription Enums
    public enum SubscriptionPlanType implements KeyValueEnum {
        FREE("free", "Free"),
        PAID("paid", "Paid");

        private final String key;
        private final String value;

        SubscriptionPlanType(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    public enum SubscriptionPlanPriceType implements KeyValueEnum {
        MONTHLY("monthly", "Monthly"),
        YEARLY("yearly", "Yearly"),
        LIFE_TIME("life_time", "Life Time");

        private final String key;
        private final String value;

        SubscriptionPlanPriceType(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    public enum OrganizationCurrency implements KeyValueEnum {
        DOLLAR("dollar", "Dollar");

        private final String key;
        private final String value;

        OrganizationCurrency(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    // User Enums
    public enum UserCategory implements KeyValueEnum {
        PORTAL_USER("portal_user", "ProStrategy User"),
        ORGANIZATION_USER("organization_user", "Organization");

        private final String key;
        private final String value;

        UserCategory(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    public enum UserType implements KeyValueEnum {
        ORGANIZATION_ADMIN("organization_admin", "Admin User"),
        ORGANIZATION_DEPARTMENT("organization_department", "Department User"),
        ORGANIZATION_GUEST("organization_guest", "Guest User");

        private final String key;
        private final String value;

        UserType(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }

        @JsonCreator
        public static UserType fromKey(String key) {
            for (UserType type : UserType.values()) {
                if (type.key.equalsIgnoreCase(key)) {
                    return type;
                }
            }
            throw new IllegalArgumentException("Invalid user type: " + key);
        }
    }

    // Role Enums
    public enum RoleType implements KeyValueEnum {
        ORGANIZATION_ADMIN("organization_admin", "Admin Role"),
        ORGANIZATION_DEPARTMENT("organization_department", "Department Role"),
        ORGANIZATION_GUEST("organization_guest", "Guest User Role");

        private final String key;
        private final String value;

        RoleType(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }

        @JsonCreator
        public static RoleType fromKey(String key) {
            for (RoleType type : RoleType.values()) {
                if (type.key.equalsIgnoreCase(key)) {
                    return type;
                }
            }
            throw new IllegalArgumentException("Invalid role type: " + key);
        }
    }

    // Payment Enums
    public enum PaymentStatus implements KeyValueEnum {
        INPROGRESS("inprogress", "InProgress"),
        COMPLETED("completed", "Completed"),
        FAILED("failed", "Failed");

        private final String key;
        private final String value;

        PaymentStatus(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    // Department Choices
    public enum DepartmentChoices implements KeyValueEnum {
        MARKETING("marketing", "Marketing"),
        FINANCE("finance", "Finance"),
        HR("hr", "HR"),
        ENGINEERING("engineering", "Engineering"),
        BRANCH("branch", "Branch"),
        LANDING("landing", "Landing"),
        ORGANIZATION("organization", "Organization"),
        OTHER("other", "Other");

        private final String key;
        private final String value;

        DepartmentChoices(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    // Subscription Request Status
    public enum SubscriptionRequestStatus implements KeyValueEnum {
        DELETED("deleted", "Deleted"),
        PENDING("pending", "Pending"),
        SUBSCRIPTION_LINK_SENT("subscription_link_sent", "Subscription Link Sent"),
        ONBOARDED("onboarded", "Onboarded"),
        IN_ACTIVE("in_active", "InActive");

        private final String key;
        private final String value;

        SubscriptionRequestStatus(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    // Organization Subscription Status
    public enum OrganizationSubscriptionStatus implements KeyValueEnum {
        ACTIVE("active", "Active"),
        IN_ACTIVE("in_active", "InActive"),
        PENDING("pending", "Pending"),
        DELETED("deleted", "Deleted");

        private final String key;
        private final String value;

        OrganizationSubscriptionStatus(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    // Strategic Plan Status
    public enum StrategicPlanStatus implements KeyValueEnum {
        DELETED("deleted", "Deleted"),
        ACTIVE("active", "Active"),
        IN_ACTIVE("in_active", "InActive");

        private final String key;
        private final String value;

        StrategicPlanStatus(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    // Form Options (for SWOT, SVA, Sustaining Objectives, etc.)
    public enum FormOptions implements KeyValueEnum {
        DELETED("deleted", "Deleted"),
        ACTIVE("active", "Active");

        private final String key;
        private final String value;

        FormOptions(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    // Constants Maps
    public static final Map<String, String> ACTION_NAME_MAPPING = Map.of(
            "create", "Create",
            "edit", "Edit",
            "delete", "Delete",
            "list", "List",
            "read_only", "Read Only",
            "has_access", "Has Access");

    public static final Map<String, String> ROLE_RESOURCE_MAPPING;

    static {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("users", "User Management");
        map.put("roles", "Role Management");
        map.put("org_mission", "Organization Mission");
        map.put("org_vision", "Organization Vision");
        map.put("org_value", "Organization Value");
        map.put("org_sustaining_objectives", "Organization Sustaining Objectives");
        map.put("org_swot_form", "Organization SWOT Form");
        map.put("org_swot_analysis", "Organization SWOT Analysis");
        map.put("org_strategic_goals", "Organization Strategic Goals");
        map.put("department", "Department");
        map.put("dept_settings_business_targets", "Department Settings Business Targets");
        map.put("dept_mission", "Department Mission");
        map.put("dept_vision", "Department Vision");
        map.put("dept_value", "Department Value");
        map.put("dept_sustaining_objectives", "Department Sustaining Objectives");
        map.put("dept_swot_form", "Department SWOT Form");
        map.put("dept_swot_analysis", "Department SWOT Analysis");
        map.put("dept_strategic_goals", "Department Strategic Goals");
        map.put("dept_strategy_form", "Department Strategic Form");
        map.put("dept_strategy_data", "Department Strategic Data");
        map.put("dept_strategy_gantt_chart", "Department Strategic Gantt Chart");
        map.put("dept_strategy_forecast", "Department Strategic Forecast");
        map.put("dept_strategy_graph", "Department Strategic Graph");
        map.put("dept_expected_delivery", "Expected Delivery");
        map.put("dept_minimum_requirements", "Department Minimum Requirements");
        map.put("dept_market_competitive", "Department Market Competitive");
        map.put("dept_leadership", "Department Leadership");
        map.put("dept_elite", "Department Elite");
        map.put("org_settings", "Organization Settings");
        map.put("org_business_targets", "Organization Business Targets");
        map.put("org_agent_name", "Organization Agent Name");
        map.put("org_agent_link", "Organization Agent Link");
        map.put("subscription_upgrade_downgrade", "Upgrade/Downgrade Plan");
        map.put("subscription_billing_history", "Billing History");
        map.put("strategic_plans", "Strategic Plan Management");
        map.put("org_goal_alignment", "Organization Goal Alignment");
        map.put("org_pillars", "Organization Pillars");
        map.put("goal_deliverable_summary", "Goal Deliverable Summary");
        map.put("strategy_summary", "Strategy Summary");
        map.put("core_purpose_visionary_trajectory", "Core Purpose/Vision Trajectory");
        map.put("history_strategic_foundation", "History and Strategic Foundation");
        map.put("benefit_analysis_strategic_outcome", "Benefit Analysis/Strategic Outcome");
        map.put("potential_risk_contingencies", "Potential Risk/Contingencies");
        map.put("strategy_phasing_timing", "Strategy Phasing/Timing");
        map.put("cost_benefit_model", "Cost Benefit/Model");
        map.put("strategic_implementation_group", "Strategic Implementation Group(SIG)");
        map.put("strategic_binder_editing_list", "Strategic Binder Monitor");

        ROLE_RESOURCE_MAPPING = Collections.unmodifiableMap(map);
    }

    public static final Map<String, String> METRIC_RESOURCE_MAPPING;

    static {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("1", "first");
        map.put("2", "second");
        map.put("3", "third");
        map.put("4", "fourth");
        map.put("5", "fifth");
        map.put("6", "sixth");
        map.put("7", "seventh");
        map.put("8", "eighth");
        METRIC_RESOURCE_MAPPING = Collections.unmodifiableMap(map);
    }

    public static final List<String> STRATEGIC_KEYS = List.of(
            "org_goal_alignment",
            "org_pillars",
            "goal_deliverable_summary",
            "strategy_summary",
            "core_purpose_visionary_trajectory",
            "history_strategic_foundation",
            "benefit_analysis_strategic_outcome",
            "potential_risk_contingencies",
            "strategy_phasing_timing",
            "cost_benefit_model",
            "strategic_implementation_group"
    );

    public static final Map<String, String> INTERNAL_SLUG_KEYS;

    static {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("org_goal_alignment", "orgGoalAlignment");
        map.put("org_pillars", "orgPillars");
        map.put("goal_deliverable_summary", "goalDeliverableSummary");
        map.put("strategy_summary", "strategySummary");
        map.put("core_purpose_visionary_trajectory", "corePurposeVisionaryTrajectory");
        map.put("history_strategic_foundation", "historyStrategicFoundation");
        map.put("benefit_analysis_strategic_outcome", "benefitAnalysisStrategicOutcome");
        map.put("potential_risk_contingencies", "potentialRiskContingencies");
        map.put("strategy_phasing_timing", "strategyPhasingTiming");
        map.put("cost_benefit_model", "costBenefitModel");
        map.put("strategic_implementation_group", "strategicImplementationGroup");
        map.put("dept_swot_summary", "deptSwotSummary");
        INTERNAL_SLUG_KEYS = Collections.unmodifiableMap(map);
    }

    public static final Map<String, String> ORGANIZATION_STRATEGIC_SELECT_KEYS;

    static {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("mission", "Mission");
        map.put("vision", "Vision");
        map.put("value", "Value");
        map.put("org_goals", "Organization Goals");
        map.put("org_pillars", "Organization Pillars");
        map.put("organization_swot", "Organization SWOT Summary");
        map.put("strategic_value_analysis", "Strategic Value Analysis");

        ORGANIZATION_STRATEGIC_SELECT_KEYS = Collections.unmodifiableMap(map);
    }

    public static final Map<String, String> DEPARTMENT_STRATEGIC_SELECT_KEYS;

    static {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("mission", "Mission");
        map.put("vision", "Vision");
        map.put("value", "Value");
        map.put("dept_pillars", "Pillars");
        map.put("dept_swot_summary", "Department SWOT Summary");
        map.put("dept_sva_summary", "Department Strategic Value Analysis Summary");

        DEPARTMENT_STRATEGIC_SELECT_KEYS = Collections.unmodifiableMap(map);
    }

    public static final Map<String, String> SUBSCRIPTION_PLAN_PRICE_TYPE_DICT = new LinkedHashMap<>();

    static {
        SUBSCRIPTION_PLAN_PRICE_TYPE_DICT.put("monthly", "Monthly");
        SUBSCRIPTION_PLAN_PRICE_TYPE_DICT.put("yearly", "Yearly");
        SUBSCRIPTION_PLAN_PRICE_TYPE_DICT.put("life_time", "Life Time");
    }

    public static String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    // Utility method to get all active statuses
    public static List<CommonStatus> getActiveStatuses() {
        return List.of(CommonStatus.ACTIVE, CommonStatus.PENDING);
    }

    // Utility method to check if status is active
    public static boolean isActive(CommonStatus status) {
        return status == CommonStatus.ACTIVE || status == CommonStatus.PENDING;
    }

    // Utility method to check if status is deleted
    public static boolean isDeleted(CommonStatus status) {
        return status == CommonStatus.DELETED;
    }

    // Utility method to find enum by key for any KeyValueEnum
    public static <T extends Enum<T> & KeyValueEnum> T fromKey(Class<T> enumClass, String key) {
        for (T enumValue : enumClass.getEnumConstants()) {
            if (enumValue.getKey().equalsIgnoreCase(key)) {
                return enumValue;
            }
        }
        throw new IllegalArgumentException("Invalid key '" + key + "' for enum " + enumClass.getSimpleName());
    }
}