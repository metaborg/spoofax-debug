package transformer_debug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.strc.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("unused") public class InteropRegisterer extends org.strategoxt.lang.InteropRegisterer 
{ 
  @Override public void register(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    register(context, compiledContext, context.getVarScope());
  }

  @Override public void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader)
  { 
    registerLazy(context, compiledContext, classLoader, context.getVarScope());
  }

  private void register(org.spoofax.interpreter.core.IContext context, Context compiledContext, org.spoofax.interpreter.core.VarScope varScope)
  { 
    compiledContext.registerComponent("transformer_debug");
    transformer_debug.init(compiledContext);
    varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
    varScope.addSVar("execute_0_0", new InteropSDefT(execute_0_0.instance, context));
    varScope.addSVar("create_options_0_0_fragment_0", new InteropSDefT(create_options_0_0_fragment_0.instance, context));
    varScope.addSVar("create_options_0_0", new InteropSDefT(create_options_0_0.instance, context));
    varScope.addSVar("get_config_I_0_0", new InteropSDefT(get_config_$I_0_0.instance, context));
    varScope.addSVar("check_input_file_0_0", new InteropSDefT(check_input_file_0_0.instance, context));
    varScope.addSVar("create_usage_0_0", new InteropSDefT(create_usage_0_0.instance, context));
    varScope.addSVar("list_imports_0_1", new InteropSDefT(list_imports_0_1.instance, context));
    varScope.addSVar("get_internal_files_0_1", new InteropSDefT(get_internal_files_0_1.instance, context));
    varScope.addSVar("create_I_0_0", new InteropSDefT(create_$I_0_0.instance, context));
    varScope.addSVar("handle_file_0_2", new InteropSDefT(handle_file_0_2.instance, context));
    varScope.addSVar("split_path_0_1", new InteropSDefT(split_path_0_1.instance, context));
    varScope.addSVar("assert_module_0_0", new InteropSDefT(assert_module_0_0.instance, context));
    varScope.addSVar("location_to_term_0_0", new InteropSDefT(location_to_term_0_0.instance, context));
    varScope.addSVar("create_arg_0_0", new InteropSDefT(create_arg_0_0.instance, context));
    varScope.addSVar("match_term_to_s_var_clause_0_2", new InteropSDefT(match_term_to_s_var_clause_0_2.instance, context));
    varScope.addSVar("create_s_var_calls_for_Term_0_2", new InteropSDefT(create_s_var_calls_for_$Term_0_2.instance, context));
    varScope.addSVar("t_args_to_s_var_where_clause_0_2", new InteropSDefT(t_args_to_s_var_where_clause_0_2.instance, context));
    varScope.addSVar("t_args_to_s_var_where_strategy_0_2", new InteropSDefT(t_args_to_s_var_where_strategy_0_2.instance, context));
    varScope.addSVar("t_arg_to_s_var_0_2", new InteropSDefT(t_arg_to_s_var_0_2.instance, context));
    varScope.addSVar("create_s_var_call_with_term_0_2", new InteropSDefT(create_s_var_call_with_term_0_2.instance, context));
    varScope.addSVar("create_var_0_0", new InteropSDefT(create_var_0_0.instance, context));
    varScope.addSVar("create_seqs_0_0", new InteropSDefT(create_seqs_0_0.instance, context));
    varScope.addSVar("create_seq_0_0", new InteropSDefT(create_seq_0_0.instance, context));
    varScope.addSVar("add_var_statements_0_1", new InteropSDefT(add_var_statements_0_1.instance, context));
    varScope.addSVar("add_var_in_r_def_0_1", new InteropSDefT(add_var_in_r_def_0_1.instance, context));
    varScope.addSVar("add_var_in_s_def_0_1", new InteropSDefT(add_var_in_s_def_0_1.instance, context));
    varScope.addSVar("var_wrap_s_0_3", new InteropSDefT(var_wrap_s_0_3.instance, context));
    varScope.addSVar("combine_s_and_clause_0_1", new InteropSDefT(combine_s_and_clause_0_1.instance, context));
    varScope.addSVar("var_wrap_s_0_2", new InteropSDefT(var_wrap_s_0_2.instance, context));
    varScope.addSVar("var_wrap_r_0_3", new InteropSDefT(var_wrap_r_0_3.instance, context));
    varScope.addSVar("try_s_var_for_match_0_3", new InteropSDefT(try_s_var_for_match_0_3.instance, context));
    varScope.addSVar("try_s_var_for_t_args_0_3", new InteropSDefT(try_s_var_for_t_args_0_3.instance, context));
    varScope.addSVar("add_var_to_rule_cond_0_2", new InteropSDefT(add_var_to_rule_cond_0_2.instance, context));
    varScope.addSVar("add_s_var_to_clause_0_2", new InteropSDefT(add_s_var_to_clause_0_2.instance, context));
    varScope.addSVar("match_assign_build_s_var_0_2", new InteropSDefT(match_assign_build_s_var_0_2.instance, context));
    varScope.addSVar("create_s_var_call_0_4", new InteropSDefT(create_s_var_call_0_4.instance, context));
    varScope.addSVar("create_args_array_0_4", new InteropSDefT(create_args_array_0_4.instance, context));
    varScope.addSVar("get_var_name_0_0", new InteropSDefT(get_var_name_0_0.instance, context));
    varScope.addSVar("to_string_term_0_0", new InteropSDefT(to_string_term_0_0.instance, context));
    varScope.addSVar("add_step_statements_0_1", new InteropSDefT(add_step_statements_0_1.instance, context));
    varScope.addSVar("add_step_in_r_def_0_1", new InteropSDefT(add_step_in_r_def_0_1.instance, context));
    varScope.addSVar("add_step_in_s_def_0_1", new InteropSDefT(add_step_in_s_def_0_1.instance, context));
    varScope.addSVar("add_step_to_strategy_0_2", new InteropSDefT(add_step_to_strategy_0_2.instance, context));
    varScope.addSVar("create_step_call_0_3", new InteropSDefT(create_step_call_0_3.instance, context));
    varScope.addSVar("filter_location_0_0", new InteropSDefT(filter_location_0_0.instance, context));
    varScope.addSVar("add_debug_info_0_1", new InteropSDefT(add_debug_info_0_1.instance, context));
    varScope.addSVar("add_s_entry_and_exit_calls_0_1", new InteropSDefT(add_s_entry_and_exit_calls_0_1.instance, context));
    varScope.addSVar("add_r_entry_and_exit_calls_0_1", new InteropSDefT(add_r_entry_and_exit_calls_0_1.instance, context));
    varScope.addSVar("add_s_entry_and_exit_call_0_1", new InteropSDefT(add_s_entry_and_exit_call_0_1.instance, context));
    varScope.addSVar("wrap_s_0_3", new InteropSDefT(wrap_s_0_3.instance, context));
    varScope.addSVar("add_r_entry_and_exit_call_0_1", new InteropSDefT(add_r_entry_and_exit_call_0_1.instance, context));
    varScope.addSVar("wrap_r_0_3", new InteropSDefT(wrap_r_0_3.instance, context));
    varScope.addSVar("add_rule_cond_0_3", new InteropSDefT(add_rule_cond_0_3.instance, context));
    varScope.addSVar("create_r_enter_whereclause_0_3", new InteropSDefT(create_r_enter_whereclause_0_3.instance, context));
    varScope.addSVar("add_s_debug_import_0_0", new InteropSDefT(add_s_debug_import_0_0.instance, context));
    varScope.addSVar("create_r_exit_call_0_3", new InteropSDefT(create_r_exit_call_0_3.instance, context));
    varScope.addSVar("create_r_enter_call_0_3", new InteropSDefT(create_r_enter_call_0_3.instance, context));
    varScope.addSVar("create_s_enter_call_0_3", new InteropSDefT(create_s_enter_call_0_3.instance, context));
    varScope.addSVar("create_s_exit_call_0_3", new InteropSDefT(create_s_exit_call_0_3.instance, context));
    varScope.addSVar("create_fail_0_0", new InteropSDefT(create_fail_0_0.instance, context));
    varScope.addSVar("write_stratego_0_1", new InteropSDefT(write_stratego_0_1.instance, context));
    varScope.addSVar("write_stratego_rtree_0_1", new InteropSDefT(write_stratego_rtree_0_1.instance, context));
    varScope.addSVar("write_stratego_str_0_1", new InteropSDefT(write_stratego_str_0_1.instance, context));
    varScope.addSVar("write_to_file_0_2", new InteropSDefT(write_to_file_0_2.instance, context));
    varScope.addSVar("check_dir_0_0", new InteropSDefT(check_dir_0_0.instance, context));
    varScope.addSVar("create_dir_0_0", new InteropSDefT(create_dir_0_0.instance, context));
    varScope.addSVar("pp_stratego_ast_0_0", new InteropSDefT(pp_stratego_ast_0_0.instance, context));
    varScope.addSVar("parse_stratego_with_locations_0_1", new InteropSDefT(parse_stratego_with_locations_0_1.instance, context));
    varScope.addSVar("stratego_box_path_0_0", new InteropSDefT(stratego_box_path_0_0.instance, context));
    varScope.addSVar("stratego_sdf2_path_0_0", new InteropSDefT(stratego_sdf2_path_0_0.instance, context));
    varScope.addSVar("stratego_stratego_path_0_0", new InteropSDefT(stratego_stratego_path_0_0.instance, context));
    varScope.addSVar("stratego_c_path_0_0", new InteropSDefT(stratego_c_path_0_0.instance, context));
    varScope.addSVar("stratego_xml_path_0_0", new InteropSDefT(stratego_xml_path_0_0.instance, context));
    varScope.addSVar("stratego_rtg_path_0_0", new InteropSDefT(stratego_rtg_path_0_0.instance, context));
    varScope.addSVar("stratego_propstratego_path_0_0", new InteropSDefT(stratego_propstratego_path_0_0.instance, context));
    varScope.addSVar("apply_debug_trans_0_0", new InteropSDefT(apply_debug_trans_0_0.instance, context));
    varScope.addSVar("apply_debug_trans_internal_0_0", new InteropSDefT(apply_debug_trans_internal_0_0.instance, context));
    varScope.addSVar("apply_debug_trans_error_0_0", new InteropSDefT(apply_debug_trans_error_0_0.instance, context));
    varScope.addSVar("apply_debug_project_0_1", new InteropSDefT(apply_debug_project_0_1.instance, context));
  }

  private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
  { 
    compiledContext.registerComponent("transformer_debug");
    transformer_debug.init(compiledContext);
    varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "transformer_debug.main_0_0", context));
    varScope.addSVar("execute_0_0", new InteropSDefT(classLoader, "transformer_debug.execute_0_0", context));
    varScope.addSVar("create_options_0_0_fragment_0", new InteropSDefT(classLoader, "transformer_debug.create_options_0_0_fragment_0", context));
    varScope.addSVar("create_options_0_0", new InteropSDefT(classLoader, "transformer_debug.create_options_0_0", context));
    varScope.addSVar("get_config_I_0_0", new InteropSDefT(classLoader, "transformer_debug.get_config_$I_0_0", context));
    varScope.addSVar("check_input_file_0_0", new InteropSDefT(classLoader, "transformer_debug.check_input_file_0_0", context));
    varScope.addSVar("create_usage_0_0", new InteropSDefT(classLoader, "transformer_debug.create_usage_0_0", context));
    varScope.addSVar("list_imports_0_1", new InteropSDefT(classLoader, "transformer_debug.list_imports_0_1", context));
    varScope.addSVar("get_internal_files_0_1", new InteropSDefT(classLoader, "transformer_debug.get_internal_files_0_1", context));
    varScope.addSVar("create_I_0_0", new InteropSDefT(classLoader, "transformer_debug.create_$I_0_0", context));
    varScope.addSVar("handle_file_0_2", new InteropSDefT(classLoader, "transformer_debug.handle_file_0_2", context));
    varScope.addSVar("split_path_0_1", new InteropSDefT(classLoader, "transformer_debug.split_path_0_1", context));
    varScope.addSVar("assert_module_0_0", new InteropSDefT(classLoader, "transformer_debug.assert_module_0_0", context));
    varScope.addSVar("location_to_term_0_0", new InteropSDefT(classLoader, "transformer_debug.location_to_term_0_0", context));
    varScope.addSVar("create_arg_0_0", new InteropSDefT(classLoader, "transformer_debug.create_arg_0_0", context));
    varScope.addSVar("match_term_to_s_var_clause_0_2", new InteropSDefT(classLoader, "transformer_debug.match_term_to_s_var_clause_0_2", context));
    varScope.addSVar("create_s_var_calls_for_Term_0_2", new InteropSDefT(classLoader, "transformer_debug.create_s_var_calls_for_$Term_0_2", context));
    varScope.addSVar("t_args_to_s_var_where_clause_0_2", new InteropSDefT(classLoader, "transformer_debug.t_args_to_s_var_where_clause_0_2", context));
    varScope.addSVar("t_args_to_s_var_where_strategy_0_2", new InteropSDefT(classLoader, "transformer_debug.t_args_to_s_var_where_strategy_0_2", context));
    varScope.addSVar("t_arg_to_s_var_0_2", new InteropSDefT(classLoader, "transformer_debug.t_arg_to_s_var_0_2", context));
    varScope.addSVar("create_s_var_call_with_term_0_2", new InteropSDefT(classLoader, "transformer_debug.create_s_var_call_with_term_0_2", context));
    varScope.addSVar("create_var_0_0", new InteropSDefT(classLoader, "transformer_debug.create_var_0_0", context));
    varScope.addSVar("create_seqs_0_0", new InteropSDefT(classLoader, "transformer_debug.create_seqs_0_0", context));
    varScope.addSVar("create_seq_0_0", new InteropSDefT(classLoader, "transformer_debug.create_seq_0_0", context));
    varScope.addSVar("add_var_statements_0_1", new InteropSDefT(classLoader, "transformer_debug.add_var_statements_0_1", context));
    varScope.addSVar("add_var_in_r_def_0_1", new InteropSDefT(classLoader, "transformer_debug.add_var_in_r_def_0_1", context));
    varScope.addSVar("add_var_in_s_def_0_1", new InteropSDefT(classLoader, "transformer_debug.add_var_in_s_def_0_1", context));
    varScope.addSVar("var_wrap_s_0_3", new InteropSDefT(classLoader, "transformer_debug.var_wrap_s_0_3", context));
    varScope.addSVar("combine_s_and_clause_0_1", new InteropSDefT(classLoader, "transformer_debug.combine_s_and_clause_0_1", context));
    varScope.addSVar("var_wrap_s_0_2", new InteropSDefT(classLoader, "transformer_debug.var_wrap_s_0_2", context));
    varScope.addSVar("var_wrap_r_0_3", new InteropSDefT(classLoader, "transformer_debug.var_wrap_r_0_3", context));
    varScope.addSVar("try_s_var_for_match_0_3", new InteropSDefT(classLoader, "transformer_debug.try_s_var_for_match_0_3", context));
    varScope.addSVar("try_s_var_for_t_args_0_3", new InteropSDefT(classLoader, "transformer_debug.try_s_var_for_t_args_0_3", context));
    varScope.addSVar("add_var_to_rule_cond_0_2", new InteropSDefT(classLoader, "transformer_debug.add_var_to_rule_cond_0_2", context));
    varScope.addSVar("add_s_var_to_clause_0_2", new InteropSDefT(classLoader, "transformer_debug.add_s_var_to_clause_0_2", context));
    varScope.addSVar("match_assign_build_s_var_0_2", new InteropSDefT(classLoader, "transformer_debug.match_assign_build_s_var_0_2", context));
    varScope.addSVar("create_s_var_call_0_4", new InteropSDefT(classLoader, "transformer_debug.create_s_var_call_0_4", context));
    varScope.addSVar("create_args_array_0_4", new InteropSDefT(classLoader, "transformer_debug.create_args_array_0_4", context));
    varScope.addSVar("get_var_name_0_0", new InteropSDefT(classLoader, "transformer_debug.get_var_name_0_0", context));
    varScope.addSVar("to_string_term_0_0", new InteropSDefT(classLoader, "transformer_debug.to_string_term_0_0", context));
    varScope.addSVar("add_step_statements_0_1", new InteropSDefT(classLoader, "transformer_debug.add_step_statements_0_1", context));
    varScope.addSVar("add_step_in_r_def_0_1", new InteropSDefT(classLoader, "transformer_debug.add_step_in_r_def_0_1", context));
    varScope.addSVar("add_step_in_s_def_0_1", new InteropSDefT(classLoader, "transformer_debug.add_step_in_s_def_0_1", context));
    varScope.addSVar("add_step_to_strategy_0_2", new InteropSDefT(classLoader, "transformer_debug.add_step_to_strategy_0_2", context));
    varScope.addSVar("create_step_call_0_3", new InteropSDefT(classLoader, "transformer_debug.create_step_call_0_3", context));
    varScope.addSVar("filter_location_0_0", new InteropSDefT(classLoader, "transformer_debug.filter_location_0_0", context));
    varScope.addSVar("add_debug_info_0_1", new InteropSDefT(classLoader, "transformer_debug.add_debug_info_0_1", context));
    varScope.addSVar("add_s_entry_and_exit_calls_0_1", new InteropSDefT(classLoader, "transformer_debug.add_s_entry_and_exit_calls_0_1", context));
    varScope.addSVar("add_r_entry_and_exit_calls_0_1", new InteropSDefT(classLoader, "transformer_debug.add_r_entry_and_exit_calls_0_1", context));
    varScope.addSVar("add_s_entry_and_exit_call_0_1", new InteropSDefT(classLoader, "transformer_debug.add_s_entry_and_exit_call_0_1", context));
    varScope.addSVar("wrap_s_0_3", new InteropSDefT(classLoader, "transformer_debug.wrap_s_0_3", context));
    varScope.addSVar("add_r_entry_and_exit_call_0_1", new InteropSDefT(classLoader, "transformer_debug.add_r_entry_and_exit_call_0_1", context));
    varScope.addSVar("wrap_r_0_3", new InteropSDefT(classLoader, "transformer_debug.wrap_r_0_3", context));
    varScope.addSVar("add_rule_cond_0_3", new InteropSDefT(classLoader, "transformer_debug.add_rule_cond_0_3", context));
    varScope.addSVar("create_r_enter_whereclause_0_3", new InteropSDefT(classLoader, "transformer_debug.create_r_enter_whereclause_0_3", context));
    varScope.addSVar("add_s_debug_import_0_0", new InteropSDefT(classLoader, "transformer_debug.add_s_debug_import_0_0", context));
    varScope.addSVar("create_r_exit_call_0_3", new InteropSDefT(classLoader, "transformer_debug.create_r_exit_call_0_3", context));
    varScope.addSVar("create_r_enter_call_0_3", new InteropSDefT(classLoader, "transformer_debug.create_r_enter_call_0_3", context));
    varScope.addSVar("create_s_enter_call_0_3", new InteropSDefT(classLoader, "transformer_debug.create_s_enter_call_0_3", context));
    varScope.addSVar("create_s_exit_call_0_3", new InteropSDefT(classLoader, "transformer_debug.create_s_exit_call_0_3", context));
    varScope.addSVar("create_fail_0_0", new InteropSDefT(classLoader, "transformer_debug.create_fail_0_0", context));
    varScope.addSVar("write_stratego_0_1", new InteropSDefT(classLoader, "transformer_debug.write_stratego_0_1", context));
    varScope.addSVar("write_stratego_rtree_0_1", new InteropSDefT(classLoader, "transformer_debug.write_stratego_rtree_0_1", context));
    varScope.addSVar("write_stratego_str_0_1", new InteropSDefT(classLoader, "transformer_debug.write_stratego_str_0_1", context));
    varScope.addSVar("write_to_file_0_2", new InteropSDefT(classLoader, "transformer_debug.write_to_file_0_2", context));
    varScope.addSVar("check_dir_0_0", new InteropSDefT(classLoader, "transformer_debug.check_dir_0_0", context));
    varScope.addSVar("create_dir_0_0", new InteropSDefT(classLoader, "transformer_debug.create_dir_0_0", context));
    varScope.addSVar("pp_stratego_ast_0_0", new InteropSDefT(classLoader, "transformer_debug.pp_stratego_ast_0_0", context));
    varScope.addSVar("parse_stratego_with_locations_0_1", new InteropSDefT(classLoader, "transformer_debug.parse_stratego_with_locations_0_1", context));
    varScope.addSVar("stratego_box_path_0_0", new InteropSDefT(classLoader, "transformer_debug.stratego_box_path_0_0", context));
    varScope.addSVar("stratego_sdf2_path_0_0", new InteropSDefT(classLoader, "transformer_debug.stratego_sdf2_path_0_0", context));
    varScope.addSVar("stratego_stratego_path_0_0", new InteropSDefT(classLoader, "transformer_debug.stratego_stratego_path_0_0", context));
    varScope.addSVar("stratego_c_path_0_0", new InteropSDefT(classLoader, "transformer_debug.stratego_c_path_0_0", context));
    varScope.addSVar("stratego_xml_path_0_0", new InteropSDefT(classLoader, "transformer_debug.stratego_xml_path_0_0", context));
    varScope.addSVar("stratego_rtg_path_0_0", new InteropSDefT(classLoader, "transformer_debug.stratego_rtg_path_0_0", context));
    varScope.addSVar("stratego_propstratego_path_0_0", new InteropSDefT(classLoader, "transformer_debug.stratego_propstratego_path_0_0", context));
    varScope.addSVar("apply_debug_trans_0_0", new InteropSDefT(classLoader, "transformer_debug.apply_debug_trans_0_0", context));
    varScope.addSVar("apply_debug_trans_internal_0_0", new InteropSDefT(classLoader, "transformer_debug.apply_debug_trans_internal_0_0", context));
    varScope.addSVar("apply_debug_trans_error_0_0", new InteropSDefT(classLoader, "transformer_debug.apply_debug_trans_error_0_0", context));
    varScope.addSVar("apply_debug_project_0_1", new InteropSDefT(classLoader, "transformer_debug.apply_debug_project_0_1", context));
  }
}